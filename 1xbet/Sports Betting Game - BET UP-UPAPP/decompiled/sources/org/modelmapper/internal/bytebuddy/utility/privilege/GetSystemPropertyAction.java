package org.modelmapper.internal.bytebuddy.utility.privilege;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.security.PrivilegedAction;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class GetSystemPropertyAction implements PrivilegedAction<String> {
    private final String key;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.key.equals(((GetSystemPropertyAction) obj).key);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.key.hashCode();
    }

    public GetSystemPropertyAction(String str) {
        this.key = str;
    }

    @Override // java.security.PrivilegedAction
    public String run() {
        return System.getProperty(this.key);
    }
}
