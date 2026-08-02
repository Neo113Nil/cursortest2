package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class Slf4jEnvUtil {
    public static java.lang.String slf4jVersion() {
        java.lang.Package r0 = org.slf4j.helpers.Slf4jEnvUtil.class.getPackage();
        if (r0 == null) {
            return null;
        }
        return r0.getImplementationVersion();
    }
}
