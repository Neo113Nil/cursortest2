package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public final class z implements java.lang.Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer[] f3815a;
    public final java.lang.String b;

    public z(java.lang.String str) {
        this.f3815a = new java.lang.Integer[0];
        if (android.text.TextUtils.isEmpty(str) || !str.matches("^[0-9.]+$")) {
            throw new com.fyber.inneractive.sdk.model.vast.y();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : str.split("\\.")) {
            arrayList.add(java.lang.Integer.valueOf(com.fyber.inneractive.sdk.util.v.a(str2, 0)));
        }
        this.f3815a = (java.lang.Integer[]) arrayList.toArray(new java.lang.Integer[arrayList.size()]);
        this.b = str;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.fyber.inneractive.sdk.model.vast.z zVar) {
        if (zVar == null) {
            return 1;
        }
        int max = java.lang.Math.max(this.f3815a.length, zVar.f3815a.length);
        int i = 0;
        while (i < max) {
            java.lang.Integer[] numArr = this.f3815a;
            int intValue = numArr.length > i ? numArr[i].intValue() : 0;
            java.lang.Integer[] numArr2 = zVar.f3815a;
            int intValue2 = numArr2.length > i ? numArr2[i].intValue() : 0;
            if (intValue > intValue2) {
                return 1;
            }
            if (intValue2 > intValue) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
