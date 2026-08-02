package org.modelmapper.internal.objenesis.strategy;

import java.io.NotSerializableException;
import java.io.Serializable;
import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.android.AndroidSerializationInstantiator;
import org.modelmapper.internal.objenesis.instantiator.basic.ObjectInputStreamInstantiator;
import org.modelmapper.internal.objenesis.instantiator.basic.ObjectStreamClassInstantiator;
import org.modelmapper.internal.objenesis.instantiator.gcj.GCJSerializationInstantiator;
import org.modelmapper.internal.objenesis.instantiator.perc.PercSerializationInstantiator;
import org.modelmapper.internal.objenesis.instantiator.sun.SunReflectionFactorySerializationInstantiator;

/* loaded from: classes4.dex */
public class SerializingInstantiatorStrategy extends BaseInstantiatorStrategy {
    @Override // org.modelmapper.internal.objenesis.strategy.InstantiatorStrategy
    public <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> cls) {
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new ObjenesisException(new NotSerializableException(cls + " not serializable"));
        }
        if (PlatformDescription.JVM_NAME.startsWith("Java HotSpot") || PlatformDescription.isThisJVM(PlatformDescription.OPENJDK)) {
            if (PlatformDescription.isGoogleAppEngine() && PlatformDescription.SPECIFICATION_VERSION.equals("1.7")) {
                return new ObjectInputStreamInstantiator(cls);
            }
            return new SunReflectionFactorySerializationInstantiator(cls);
        }
        if (PlatformDescription.JVM_NAME.startsWith(PlatformDescription.DALVIK)) {
            if (PlatformDescription.isAndroidOpenJDK()) {
                return new ObjectStreamClassInstantiator(cls);
            }
            return new AndroidSerializationInstantiator(cls);
        }
        if (PlatformDescription.JVM_NAME.startsWith(PlatformDescription.GNU)) {
            return new GCJSerializationInstantiator(cls);
        }
        if (PlatformDescription.JVM_NAME.startsWith(PlatformDescription.PERC)) {
            return new PercSerializationInstantiator(cls);
        }
        return new SunReflectionFactorySerializationInstantiator(cls);
    }
}
