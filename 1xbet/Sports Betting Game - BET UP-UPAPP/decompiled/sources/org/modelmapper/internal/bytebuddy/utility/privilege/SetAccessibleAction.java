package org.modelmapper.internal.bytebuddy.utility.privilege;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class SetAccessibleAction<T extends AccessibleObject> implements PrivilegedAction<T> {
    private final T accessibleObject;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.accessibleObject.equals(((SetAccessibleAction) obj).accessibleObject);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.accessibleObject.hashCode();
    }

    public SetAccessibleAction(T t) {
        this.accessibleObject = t;
    }

    @Override // java.security.PrivilegedAction
    public T run() {
        this.accessibleObject.setAccessible(true);
        return this.accessibleObject;
    }
}
