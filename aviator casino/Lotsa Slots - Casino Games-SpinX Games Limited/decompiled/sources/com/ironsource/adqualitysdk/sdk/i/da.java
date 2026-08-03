package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class da extends com.ironsource.adqualitysdk.sdk.i.cw {
    /* renamed from: ｋ, reason: contains not printable characters */
    public static com.ironsource.adqualitysdk.sdk.i.cm.d m7418(java.util.List<java.lang.Object> list) {
        return new com.ironsource.adqualitysdk.sdk.i.cm.d((java.util.List) m7362(list, 0, java.util.List.class), ((java.lang.Integer) m7362(list, 1, java.lang.Integer.class)).intValue());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static java.lang.Object m7420(java.util.List<java.lang.Object> list) {
        java.lang.Object obj;
        java.lang.Class<?> cls;
        com.ironsource.adqualitysdk.sdk.i.hz hzVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Class<?> cls2;
        com.ironsource.adqualitysdk.sdk.i.hz hzVar2;
        java.lang.Object obj4;
        int size = list.size();
        java.lang.Object obj5 = null;
        java.lang.Class<?> cls3 = null;
        if (size == 2) {
            if (list.get(0) instanceof java.lang.Class) {
                cls = (java.lang.Class) m7362(list, 0, java.lang.Class.class);
                obj = null;
            } else {
                java.lang.Object obj6 = m7362(list, 0, java.lang.Object.class);
                if (obj6 != null) {
                    obj = obj6;
                    cls = obj6.getClass();
                } else {
                    obj = obj6;
                    cls = null;
                }
            }
            hzVar = (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.hz.class);
            cls3 = cls;
            obj2 = obj;
            obj3 = null;
        } else if (size == 3) {
            if (list.get(0) instanceof java.lang.Class) {
                cls2 = (java.lang.Class) m7362(list, 0, java.lang.Class.class);
                if (list.get(1) instanceof com.ironsource.adqualitysdk.sdk.i.hz) {
                    hzVar2 = (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.hz.class);
                    obj4 = m7362(list, 2, java.lang.Object.class);
                } else {
                    java.lang.Object obj7 = m7362(list, 1, java.lang.Object.class);
                    hzVar = (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 2, com.ironsource.adqualitysdk.sdk.i.hz.class);
                    obj3 = null;
                    cls3 = cls2;
                    obj2 = obj7;
                }
            } else {
                obj5 = m7362(list, 0, java.lang.Object.class);
                cls2 = obj5.getClass();
                hzVar2 = (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.hz.class);
                obj4 = m7362(list, 2, java.lang.Object.class);
            }
            obj3 = obj4;
            hzVar = hzVar2;
            java.lang.Object obj8 = obj5;
            cls3 = cls2;
            obj2 = obj8;
        } else if (size != 4) {
            hzVar = null;
            obj2 = null;
            obj3 = null;
        } else {
            cls3 = (java.lang.Class) m7362(list, 0, java.lang.Class.class);
            obj2 = m7362(list, 1, java.lang.Object.class);
            com.ironsource.adqualitysdk.sdk.i.hz hzVar3 = (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 2, com.ironsource.adqualitysdk.sdk.i.hz.class);
            obj3 = m7362(list, 3, java.lang.Object.class);
            hzVar = hzVar3;
        }
        com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936();
        return com.ironsource.adqualitysdk.sdk.i.ih.m8030(cls3, obj2, hzVar, obj3);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static java.util.List<java.lang.Object> m7419(java.util.List<java.lang.Object> list) {
        java.lang.Object obj;
        com.ironsource.adqualitysdk.sdk.i.hz hzVar;
        java.lang.Class<?> cls;
        int size = list.size();
        java.lang.Class<?> cls2 = null;
        cls2 = null;
        java.lang.Object obj2 = null;
        if (size == 2) {
            if (list.get(0) instanceof java.lang.Class) {
                cls2 = (java.lang.Class) m7362(list, 0, java.lang.Class.class);
                obj = null;
            } else {
                obj = m7362(list, 0, java.lang.Object.class);
                if (obj != null) {
                    cls2 = obj.getClass();
                }
            }
            hzVar = (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.hz.class);
        } else if (size != 3) {
            hzVar = null;
            obj = null;
        } else {
            if (list.get(0) instanceof java.lang.Class) {
                cls = (java.lang.Class) m7362(list, 0, java.lang.Class.class);
                if (list.get(1) instanceof com.ironsource.adqualitysdk.sdk.i.hz) {
                    hzVar = (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.hz.class);
                } else {
                    obj2 = m7362(list, 1, java.lang.Object.class);
                    hzVar = (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 2, com.ironsource.adqualitysdk.sdk.i.hz.class);
                }
            } else {
                obj2 = m7362(list, 0, java.lang.Object.class);
                cls = obj2.getClass();
                hzVar = (com.ironsource.adqualitysdk.sdk.i.hz) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.hz.class);
            }
            java.lang.Object obj3 = obj2;
            cls2 = cls;
            obj = obj3;
        }
        com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936();
        return com.ironsource.adqualitysdk.sdk.i.ih.m8038(cls2, obj, hzVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m7421(final com.ironsource.adqualitysdk.sdk.i.ee eeVar, final com.ironsource.adqualitysdk.sdk.i.cl clVar, java.util.List<java.lang.Object> list) {
        java.lang.Object obj = m7362(list, 0, java.lang.Object.class);
        final com.ironsource.adqualitysdk.sdk.i.cm cmVar = (com.ironsource.adqualitysdk.sdk.i.cm) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.cm.class);
        final java.util.List<java.lang.Object> list2 = m7361(list, 2);
        if (cmVar == null) {
            return null;
        }
        return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936().m8044(obj, cmVar.m7260(new com.ironsource.adqualitysdk.sdk.i.ii() { // from class: com.ironsource.adqualitysdk.sdk.i.da.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ */
            public final boolean mo7425(com.ironsource.adqualitysdk.sdk.i.Cif cif) {
                return com.ironsource.adqualitysdk.sdk.i.cm.this.m7261().m7303(cif, eeVar, clVar, list2);
            }
        }));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final java.lang.Object m7424(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar, java.util.List<java.lang.Object> list) {
        com.ironsource.adqualitysdk.sdk.i.Cif m7421 = m7421(eeVar, clVar, list);
        if (m7421 != null) {
            return m7421.mo7963();
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.util.List<com.ironsource.adqualitysdk.sdk.i.Cif> m7422(final com.ironsource.adqualitysdk.sdk.i.ee eeVar, final com.ironsource.adqualitysdk.sdk.i.cl clVar, java.util.List<java.lang.Object> list) {
        java.lang.Object obj = m7362(list, 0, java.lang.Object.class);
        final com.ironsource.adqualitysdk.sdk.i.cm cmVar = (com.ironsource.adqualitysdk.sdk.i.cm) m7362(list, 1, com.ironsource.adqualitysdk.sdk.i.cm.class);
        final java.util.List<java.lang.Object> list2 = m7361(list, 2);
        if (cmVar == null) {
            return null;
        }
        return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936().m8042(obj, cmVar.m7260(new com.ironsource.adqualitysdk.sdk.i.ii() { // from class: com.ironsource.adqualitysdk.sdk.i.da.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final boolean mo7425(com.ironsource.adqualitysdk.sdk.i.Cif cif) {
                return com.ironsource.adqualitysdk.sdk.i.cm.this.m7261().m7303(cif, eeVar, clVar, list2);
            }
        }));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.util.List<java.lang.Object> m7423(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar, java.util.List<java.lang.Object> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.ironsource.adqualitysdk.sdk.i.Cif cif : m7422(eeVar, clVar, list)) {
            if (cif != null) {
                arrayList.add(cif.mo7963());
            }
        }
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static java.lang.String m7416(java.util.List<java.lang.Object> list) {
        if (list.get(0) instanceof java.lang.Class) {
            return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936().m8043((java.lang.Class) m7362(list, 0, java.lang.Class.class), (java.lang.String) m7362(list, 1, java.lang.String.class));
        }
        java.lang.Object obj = m7362(list, 0, java.lang.Object.class);
        if (list.get(1) instanceof java.util.List) {
            return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936().m8047(obj, new org.json.JSONArray((java.util.Collection) m7362(list, 1, java.util.List.class)));
        }
        if (list.get(1) instanceof org.json.JSONArray) {
            return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936().m8047(obj, (org.json.JSONArray) m7362(list, 1, org.json.JSONArray.class));
        }
        return com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936().m8046(obj, (java.lang.String) m7362(list, 1, java.lang.String.class));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static java.lang.String m7417(java.util.List<java.lang.Object> list) {
        java.lang.Object obj = m7362(list, 0, java.lang.Object.class);
        java.util.List list2 = (java.util.List) m7362(list, 1, java.util.List.class);
        int intValue = ((java.lang.Integer) m7362(list, 2, java.lang.Integer.class)).intValue();
        com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936();
        return com.ironsource.adqualitysdk.sdk.i.ih.m8032(obj, (java.util.List<java.lang.String>) list2, intValue);
    }
}
