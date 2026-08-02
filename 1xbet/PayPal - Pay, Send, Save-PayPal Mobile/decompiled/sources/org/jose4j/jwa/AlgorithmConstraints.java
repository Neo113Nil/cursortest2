package org.jose4j.jwa;

/* loaded from: classes18.dex */
public class AlgorithmConstraints {
    private final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    private final org.jose4j.jwa.AlgorithmConstraints.ConstraintType getHighResolutionOutputSizeshNQ4ISI;
    public static final org.jose4j.jwa.AlgorithmConstraints NO_CONSTRAINTS = new org.jose4j.jwa.AlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints.ConstraintType.BLOCK, new java.lang.String[0]);
    public static final org.jose4j.jwa.AlgorithmConstraints DISALLOW_NONE = new org.jose4j.jwa.AlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints.ConstraintType.BLOCK, "none");
    public static final org.jose4j.jwa.AlgorithmConstraints ALLOW_ONLY_NONE = new org.jose4j.jwa.AlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints.ConstraintType.PERMIT, "none");

    public enum ConstraintType {
        WHITELIST,
        BLACKLIST,
        PERMIT,
        BLOCK
    }

    public AlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints.ConstraintType constraintType, java.lang.String... strArr) {
        if (constraintType == null) {
            throw new java.lang.NullPointerException("ConstraintType cannot be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = constraintType;
        this.Camera2StreamConfigurationMap = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    /* renamed from: org.jose4j.jwa.AlgorithmConstraints$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[org.jose4j.jwa.AlgorithmConstraints.ConstraintType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[org.jose4j.jwa.AlgorithmConstraints.ConstraintType.PERMIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.jose4j.jwa.AlgorithmConstraints.ConstraintType.WHITELIST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.jose4j.jwa.AlgorithmConstraints.ConstraintType.BLOCK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.jose4j.jwa.AlgorithmConstraints.ConstraintType.BLACKLIST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public void checkConstraint(java.lang.String str) throws org.jose4j.lang.InvalidAlgorithmException {
        int i = org.jose4j.jwa.AlgorithmConstraints.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[this.getHighResolutionOutputSizeshNQ4ISI.ordinal()];
        if (i == 1 || i == 2) {
            if (this.Camera2StreamConfigurationMap.contains(str)) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
            sb.append(str);
            sb.append("' is not a permitted algorithm.");
            throw new org.jose4j.lang.InvalidAlgorithmException(sb.toString());
        }
        if ((i == 3 || i == 4) && this.Camera2StreamConfigurationMap.contains(str)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("'");
            sb2.append(str);
            sb2.append("' is a blocked algorithm.");
            throw new org.jose4j.lang.InvalidAlgorithmException(sb2.toString());
        }
    }
}
