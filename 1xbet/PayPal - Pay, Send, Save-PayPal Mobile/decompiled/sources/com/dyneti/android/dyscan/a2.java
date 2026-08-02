package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class a2 {
    public static final java.util.List f = java.util.Arrays.asList(new com.dyneti.android.dyscan.z1("a5cb58bad142a3018ae1d340e52a344c30ac95646bc6d7db6a273efdbcb6bb74", 1), new com.dyneti.android.dyscan.z1("2605d676822fef98e1ba264185f3f926b9479bda49ec6a05c836cf9ae8e49644", 2), new com.dyneti.android.dyscan.z1("1802007be2bc63bdce8e8891aca0b57f65c201e802393f1f5d7d8d1f2efd6e70", 3), new com.dyneti.android.dyscan.z1("94488f1b08ef4c8b1106d8a706223a18e32028ce7038d6a009e2e09fe24a78c6", 4), new com.dyneti.android.dyscan.z1("69cbef8a3e1f331b51002dcaeb430e37d73dc2ad70351ee7d3f053ee61ccf594", 5), new com.dyneti.android.dyscan.z1("5b7611000c3b2116dfcdf5655a9f3c9804e4004a2beea79b91e658b61b142f91", 6), new com.dyneti.android.dyscan.z1("fac5cd2b50061fc03194d4de6d69ff625d2e164156b2059fdb323a1d12c6b17f", 7), new com.dyneti.android.dyscan.z1("9669c6ce8147df30ec68073a6ce7830b96f05fb42c9099962b60b7402684f1b3", 8), new com.dyneti.android.dyscan.z1("6ecf1d922ea1cb7731db64bd4a14d7b9c75ab593b9b155ccaf2b85da175fa026", 9), new com.dyneti.android.dyscan.z1("5f23b1943a5f047915bb06e82febc903b4391fc52e793ab1fb4d8dc2781c3ade", 10), new com.dyneti.android.dyscan.z1("422b14186fb2fcc93e9ca8317d87357dcc3bdd008a04a52d39c2b68f2dce21e7", 11), new com.dyneti.android.dyscan.z1("5fa31defda9b7200abd15514c9b33496845dc7058311a019c3595ba73404c6d4", 12));
    public static final java.util.List g = java.util.Arrays.asList(new com.dyneti.android.dyscan.z1("1833832877b7d078e06dd20f446ef58f315065a20630e8cb5e57317d4c7ff222", 1), new com.dyneti.android.dyscan.z1("04a1f5ddc4e1c6d0f4b29c1a47e8f0dbf56d3303995bdce4d6e0311afeb4d001", 2), new com.dyneti.android.dyscan.z1("1191b6d2199790c5bad2b8c3d678c2aa41a23e2809ce7aa9fbec8778bc5c2973", 3), new com.dyneti.android.dyscan.z1("29e4aa19541d6c1c2bfdae8331183c15790bab4c13e86ab3ff3ed65738c852cb", 4), new com.dyneti.android.dyscan.z1("1b707952995acc2fa233c12791f7f15b9add64d7b787d89aa78aac435ba25f32", 5), new com.dyneti.android.dyscan.z1("35abad23bc91774869e8ba574f9457a45c87040d24a8348e3b8437923086e663", 6), new com.dyneti.android.dyscan.z1("8ceb6fa4b77ef06992bfa23433204e44802335132378b16c7416471b3eea879a", 7), new com.dyneti.android.dyscan.z1("1e34be275f0d4ffef3767a0ebddb03d50b6e669ad4ba35dcc8e90d1813302b2b", 8), new com.dyneti.android.dyscan.z1("1d47ed0aadf712ce2c80eb1fc2939439e5095e025bb35d76977f2207ca184434", 9), new com.dyneti.android.dyscan.z1("5bb4ee3ca0497e250462cb9c18d75a4d96659d2870bf268c0b09de5ba09df8dc", 10), new com.dyneti.android.dyscan.z1("dad0d2d7dd3debb4fadd953fd01088190076bd18eba8db33bd66c0052cb4f0e1", 11), new com.dyneti.android.dyscan.z1("8ab3d13027d353c7d6cd2c554336e5e30e0104449fee256e4942417c8a9ad1fe", 12), new com.dyneti.android.dyscan.z1("c9d1614367038910661973fc6db7294545302ed0bf4bcdaeb83da98960cdece5", 13));

    /* renamed from: a, reason: collision with root package name */
    public final android.content.pm.PackageManager f3290a;
    public java.lang.Long b;
    public int[] c;
    public int[] d;
    public android.util.SparseIntArray e;

    public a2(android.app.Activity activity) {
        this.f3290a = activity.getPackageManager();
    }

    public final void a() {
        int i;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            for (android.content.pm.PackageInfo packageInfo : this.f3290a.getInstalledPackages(0)) {
                byte[] digest = messageDigest.digest(packageInfo.packageName.getBytes(com.dyneti.android.dyscan.r2.c()));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (byte b : digest) {
                    java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        sb.append("0");
                    }
                    sb.append(hexString);
                }
                java.lang.String obj = sb.toString();
                for (com.dyneti.android.dyscan.z1 z1Var : g) {
                    if (z1Var.f3356a.equals(obj)) {
                        arrayList.add(java.lang.Integer.valueOf(z1Var.b));
                    }
                }
                for (com.dyneti.android.dyscan.z1 z1Var2 : f) {
                    if (z1Var2.f3356a.equals(obj)) {
                        arrayList2.add(java.lang.Integer.valueOf(z1Var2.b));
                    }
                }
                android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && (i = applicationInfo.flags) != 0 && (i & 1) == 0) {
                    int i2 = applicationInfo.category;
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                    java.lang.Long l = this.b;
                    if (l == null) {
                        this.b = java.lang.Long.valueOf(packageInfo.firstInstallTime);
                    } else {
                        this.b = java.lang.Long.valueOf(java.lang.Math.min(l.longValue(), packageInfo.firstInstallTime));
                    }
                }
            }
            arrayList2.size();
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = ((java.lang.Integer) arrayList.get(i3)).intValue();
            }
            this.c = iArr;
            int[] iArr2 = new int[arrayList2.size()];
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                iArr2[i4] = ((java.lang.Integer) arrayList2.get(i4)).intValue();
            }
            this.d = iArr2;
            this.e = sparseIntArray;
        } catch (java.security.NoSuchAlgorithmException unused) {
        }
    }
}
