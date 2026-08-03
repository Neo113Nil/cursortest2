package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class el extends com.ironsource.adqualitysdk.sdk.i.eo {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1989 = -8505703831577167465L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1990 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1991 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ef[] f1992;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f1993;

    public el(com.ironsource.adqualitysdk.sdk.i.ef efVar, java.lang.String str, java.util.List<com.ironsource.adqualitysdk.sdk.i.ef> list, java.util.List<com.ironsource.adqualitysdk.sdk.i.ef> list2) {
        super(str, list2);
        this.f1993 = efVar;
        if (list != null) {
            com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr = new com.ironsource.adqualitysdk.sdk.i.ef[list.size()];
            this.f1992 = efVarArr;
            list.toArray(efVarArr);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo, com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        java.lang.reflect.Method m8439;
        java.util.List<java.lang.Object> list = m7738(eeVar, clVar);
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f1993;
        if ((efVar instanceof com.ironsource.adqualitysdk.sdk.i.eq) && ((com.ironsource.adqualitysdk.sdk.i.eq) efVar).m7743().equals(m7727("\ude09ח\ue2bb\ude7a\ue768ﰵᇥை㠧", android.text.TextUtils.indexOf("", "") + 1).intern())) {
            return clVar.m7207().m7928().m7930(m7737()).m7668(eeVar, clVar, list).m7678(false);
        }
        java.lang.Object m7681 = this.f1993.m7718(eeVar, clVar).m7681();
        if (m7681 instanceof com.ironsource.adqualitysdk.sdk.i.ch) {
            return new com.ironsource.adqualitysdk.sdk.i.ea(((com.ironsource.adqualitysdk.sdk.i.ch) m7681).mo6378(clVar, m7737(), list, clVar.m7202(), eeVar));
        }
        if (m7681 instanceof com.ironsource.adqualitysdk.sdk.i.cl) {
            synchronized (m7681) {
                com.ironsource.adqualitysdk.sdk.i.cl clVar2 = (com.ironsource.adqualitysdk.sdk.i.cl) m7681;
                com.ironsource.adqualitysdk.sdk.i.dz m7206 = clVar2.m7206(m7737());
                if (m7206 != null) {
                    return m7206.m7668(clVar2.m7199(), clVar2, list).m7678(false);
                }
                java.lang.String m7200 = clVar.m7200();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m7727("궏ꦅ솇귊撱偠㋛蠛䮡癖ᡨ럨慒澩縔\uddb8ỲՀ枢רּ㒒㫧䵭\ue2ec투킂덝", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern());
                sb.append(m7737());
                com.ironsource.adqualitysdk.sdk.i.cn.m7265(m7200, sb.toString(), new java.lang.NoSuchMethodException());
            }
        }
        try {
            com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr = this.f1992;
            if (efVarArr != null) {
                m8439 = com.ironsource.adqualitysdk.sdk.i.kk.m8432(m7681, m7737(), m7728(efVarArr, eeVar, clVar));
            } else {
                m8439 = com.ironsource.adqualitysdk.sdk.i.kk.m8439(m7681, m7737(), list);
            }
            if (m8439 == null) {
                list.add(0, m7681);
                return new com.ironsource.adqualitysdk.sdk.i.ea(clVar.m7198().mo6378(clVar, m7737(), list, clVar.m7202(), eeVar));
            }
            return new com.ironsource.adqualitysdk.sdk.i.ea(m8439.invoke(m7681, list.toArray()));
        } catch (java.lang.IllegalAccessException e) {
            java.lang.String m72002 = clVar.m7200();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(m7727("궏ꦅ솇귊撱偠㋛蠛䮡癖ᡨ럨慒澩縔\uddb8ỲՀ枢רּ㒒㫧䵭\ue2ec투킂덝", 1 - android.widget.ExpandableListView.getPackedPositionType(0L)).intern());
            sb2.append(this);
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(m72002, sb2.toString(), e);
            return null;
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.String m72003 = clVar.m7200();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(m7727("궏ꦅ솇귊撱偠㋛蠛䮡癖ᡨ럨慒澩縔\uddb8ỲՀ枢רּ㒒㫧䵭\ue2ec투킂덝", (android.os.Process.myPid() >> 22) + 1).intern());
            sb3.append(this);
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(m72003, sb3.toString(), e2);
            return null;
        } catch (java.lang.Exception e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.util.List<java.lang.Class> m7728(com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr, com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = efVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f1990 + 107;
            f1991 = i3 % 128;
            if (i3 % 2 == 0) {
                arrayList.add((java.lang.Class) efVarArr[i2].m7718(eeVar, clVar).m7681());
                i2 += 92;
            } else {
                arrayList.add((java.lang.Class) efVarArr[i2].m7718(eeVar, clVar).m7681());
                i2++;
            }
        }
        int i4 = f1991 + 77;
        f1990 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    public final java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f1990 + 35;
        f1991 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String mo7729 = mo7729(m7736());
        int i4 = f1990 + 67;
        f1991 = i4 % 128;
        if (i4 % 2 != 0) {
            return mo7729;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    /* renamed from: ﻐ, reason: contains not printable characters */
    final java.lang.String mo7729(java.lang.Object[] objArr) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f1993);
        sb.append(m7727("༺\uf086\u181e༔轱", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)).intern());
        sb.append(m7737());
        sb.append(m7726());
        sb.append(m7727("漩\uf030峦漁쇿", 1 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        sb.append(m7717(objArr));
        sb.append(m7727("畣㊯ᵺ畊䒽", 1 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        java.lang.String obj = sb.toString();
        int i2 = f1991 + 113;
        f1990 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return obj;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.lang.String m7726() {
        int i = 2 % 2;
        int i2 = f1990 + 53;
        int i3 = i2 % 128;
        f1991 = i3;
        int i4 = i2 % 2;
        if (this.f1992 == null) {
            int i5 = i3 + 115;
            f1990 = i5 % 128;
            if (i5 % 2 == 0) {
                return "";
            }
            throw null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7727("㬺䡇\ued78㬆\udbdf", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1).intern());
        sb.append(m7717(this.f1992));
        sb.append(m7727("㒱凒ĉ㒏됧", 1 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)).intern());
        java.lang.String obj = sb.toString();
        int i6 = f1991 + 45;
        f1990 = i6 % 128;
        if (i6 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f1990 + 33;
        f1991 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (!super.equals(obj)) {
                int i3 = f1991 + 117;
                f1990 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            com.ironsource.adqualitysdk.sdk.i.el elVar = (com.ironsource.adqualitysdk.sdk.i.el) obj;
            com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f1993;
            if (efVar == null ? elVar.f1993 != null : !efVar.equals(elVar.f1993)) {
                return false;
            }
            com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr = this.f1992;
            if (efVarArr != null) {
                int i5 = f1991 + 43;
                f1990 = i5 % 128;
                int i6 = i5 % 2;
                boolean equals = efVarArr.equals(elVar.f1992);
                int i7 = f1990 + 15;
                f1991 = i7 % 128;
                int i8 = i7 % 2;
                return equals;
            }
            if (elVar.f1992 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int hashCode = super.hashCode() * 31;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f1993;
        int i3 = 0;
        if (efVar != null) {
            int i4 = f1991 + 39;
            f1990 = i4 % 128;
            int i5 = i4 % 2;
            i = efVar.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        com.ironsource.adqualitysdk.sdk.i.ef[] efVarArr = this.f1992;
        if (efVarArr != null) {
            int i7 = f1991 + 61;
            f1990 = i7 % 128;
            if (i7 % 2 != 0) {
                efVarArr.hashCode();
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            i3 = efVarArr.hashCode();
        }
        int i8 = i6 + i3;
        int i9 = f1991 + 95;
        f1990 = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7727(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f1989, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f1989));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
