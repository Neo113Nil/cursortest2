package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public class GcmSpecUtil {
    static final java.lang.Class getHighResolutionOutputSizeshNQ4ISI;
    static final java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    static final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;

    public static boolean isGcmSpec(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        java.lang.Class cls = getHighResolutionOutputSizeshNQ4ISI;
        return cls != null && cls.isInstance(algorithmParameterSpec);
    }

    public static boolean isGcmSpec(java.lang.Class cls) {
        return getHighResolutionOutputSizeshNQ4ISI == cls;
    }

    public static boolean gcmSpecExists() {
        return getHighResolutionOutputSizeshNQ4ISI != null;
    }

    private static java.lang.reflect.Method getHighSpeedVideoFpsRanges(final java.lang.String str) {
        try {
            return (java.lang.reflect.Method) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public final java.lang.Object run() throws java.lang.Exception {
                    return org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.getHighResolutionOutputSizeshNQ4ISI.getDeclaredMethod(str, new java.lang.Class[0]);
                }
            });
        } catch (java.security.PrivilegedActionException unused) {
            return null;
        }
    }

    public static java.security.spec.AlgorithmParameterSpec extractGcmSpec(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) throws java.security.spec.InvalidParameterSpecException {
        try {
            org.bouncycastle.internal.asn1.cms.GCMParameters gCMParameters = org.bouncycastle.internal.asn1.cms.GCMParameters.getInstance(aSN1Primitive);
            return (java.security.spec.AlgorithmParameterSpec) getHighResolutionOutputSizeshNQ4ISI.getConstructor(java.lang.Integer.TYPE, byte[].class).newInstance(org.bouncycastle.util.Integers.valueOf(gCMParameters.getIcvLen() * 8), gCMParameters.getNonce());
        } catch (java.lang.NoSuchMethodException unused) {
            throw new java.security.spec.InvalidParameterSpecException("No constructor found!");
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Construction failed: ");
            sb.append(e.getMessage());
            throw new java.security.spec.InvalidParameterSpecException(sb.toString());
        }
    }

    public static org.bouncycastle.internal.asn1.cms.GCMParameters extractGcmParameters(final java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
        try {
            return (org.bouncycastle.internal.asn1.cms.GCMParameters) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.3
                @Override // java.security.PrivilegedExceptionAction
                public final java.lang.Object run() throws java.lang.Exception {
                    return new org.bouncycastle.internal.asn1.cms.GCMParameters((byte[]) org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.getHighSpeedVideoFpsRanges.invoke(algorithmParameterSpec, new java.lang.Object[0]), ((java.lang.Integer) org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.getHighSpeedVideoFpsRangesFor.invoke(algorithmParameterSpec, new java.lang.Object[0])).intValue() / 8);
                }
            });
        } catch (java.lang.Exception unused) {
            throw new java.security.spec.InvalidParameterSpecException("Cannot process GCMParameterSpec");
        }
    }

    static org.bouncycastle.crypto.params.AEADParameters Camera2StreamConfigurationMap(final org.bouncycastle.crypto.params.KeyParameter keyParameter, final java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidAlgorithmParameterException {
        try {
            return (org.bouncycastle.crypto.params.AEADParameters) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.2
                @Override // java.security.PrivilegedExceptionAction
                public final java.lang.Object run() throws java.lang.Exception {
                    return new org.bouncycastle.crypto.params.AEADParameters(org.bouncycastle.crypto.params.KeyParameter.this, ((java.lang.Integer) org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.getHighSpeedVideoFpsRangesFor.invoke(algorithmParameterSpec, new java.lang.Object[0])).intValue(), (byte[]) org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.getHighSpeedVideoFpsRanges.invoke(algorithmParameterSpec, new java.lang.Object[0]));
                }
            });
        } catch (java.lang.Exception unused) {
            throw new java.security.InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
        }
    }

    static {
        java.lang.reflect.Method method;
        java.lang.Class loadClass = org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.loadClass(org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.class, "javax.crypto.spec.GCMParameterSpec");
        getHighResolutionOutputSizeshNQ4ISI = loadClass;
        if (loadClass != null) {
            getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges("getTLen");
            method = getHighSpeedVideoFpsRanges("getIV");
        } else {
            method = null;
            getHighSpeedVideoFpsRangesFor = null;
        }
        getHighSpeedVideoFpsRanges = method;
    }
}
