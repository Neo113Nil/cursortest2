package org.modelmapper.internal.objenesis.strategy;

import java.io.Serializable;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.android.Android10Instantiator;
import org.modelmapper.internal.objenesis.instantiator.android.Android17Instantiator;
import org.modelmapper.internal.objenesis.instantiator.android.Android18Instantiator;
import org.modelmapper.internal.objenesis.instantiator.basic.AccessibleInstantiator;
import org.modelmapper.internal.objenesis.instantiator.basic.ObjectInputStreamInstantiator;
import org.modelmapper.internal.objenesis.instantiator.gcj.GCJInstantiator;
import org.modelmapper.internal.objenesis.instantiator.perc.PercInstantiator;
import org.modelmapper.internal.objenesis.instantiator.sun.SunReflectionFactoryInstantiator;
import org.modelmapper.internal.objenesis.instantiator.sun.UnsafeFactoryInstantiator;

/* loaded from: classes4.dex */
public class StdInstantiatorStrategy extends BaseInstantiatorStrategy {
    @Override // org.modelmapper.internal.objenesis.strategy.InstantiatorStrategy
    public <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> cls) {
        if (PlatformDescription.isThisJVM("Java HotSpot") || PlatformDescription.isThisJVM(PlatformDescription.OPENJDK)) {
            if (PlatformDescription.isGoogleAppEngine() && PlatformDescription.SPECIFICATION_VERSION.equals("1.7")) {
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new ObjectInputStreamInstantiator(cls);
                }
                return new AccessibleInstantiator(cls);
            }
            return new SunReflectionFactoryInstantiator(cls);
        }
        if (PlatformDescription.isThisJVM(PlatformDescription.DALVIK)) {
            if (PlatformDescription.isAndroidOpenJDK()) {
                return new UnsafeFactoryInstantiator(cls);
            }
            if (PlatformDescription.ANDROID_VERSION <= 10) {
                return new Android10Instantiator(cls);
            }
            if (PlatformDescription.ANDROID_VERSION <= 17) {
                return new Android17Instantiator(cls);
            }
            return new Android18Instantiator(cls);
        }
        if (PlatformDescription.isThisJVM(PlatformDescription.JROCKIT)) {
            return new SunReflectionFactoryInstantiator(cls);
        }
        if (PlatformDescription.isThisJVM(PlatformDescription.GNU)) {
            return new GCJInstantiator(cls);
        }
        if (PlatformDescription.isThisJVM(PlatformDescription.PERC)) {
            return new PercInstantiator(cls);
        }
        return new UnsafeFactoryInstantiator(cls);
    }
}
