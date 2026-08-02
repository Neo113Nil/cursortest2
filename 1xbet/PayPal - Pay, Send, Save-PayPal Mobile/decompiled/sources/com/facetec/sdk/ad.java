package com.facetec.sdk;

/* loaded from: classes8.dex */
final class ad {
    ad() {
    }

    static com.facetec.sdk.q d(java.util.List<com.facetec.sdk.q> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.addAll(list.get(i).e);
            arrayList2.addAll(list.get(i).b);
        }
        com.facetec.sdk.q qVar = new com.facetec.sdk.q();
        qVar.e = arrayList;
        qVar.b = arrayList2;
        return qVar;
    }

    static java.util.List<java.util.List<java.lang.Integer>> a(java.util.List<com.facetec.sdk.q> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.addAll(list.get(i).e);
        }
        return arrayList;
    }

    static org.json.JSONArray b(java.util.List<java.util.List<com.facetec.sdk.aa>> list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i = 0; i < list.size(); i++) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i2 = 0; i2 < list.get(i).size(); i2++) {
                jSONArray2.put(list.get(i).get(i2).d());
            }
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    static org.json.JSONArray e(java.util.List<java.util.List<java.util.List<com.facetec.sdk.aa>>> list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i = 0; i < list.size(); i++) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i2 = 0; i2 < list.get(i).size(); i2++) {
                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                for (int i3 = 0; i3 < list.get(i).size(); i3++) {
                    jSONArray3.put(list.get(i).get(i2).get(i3).d());
                }
                jSONArray2.put(jSONArray3);
            }
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    static java.lang.Integer[] c(java.util.List<java.lang.Integer> list) {
        return (java.lang.Integer[]) new java.util.HashSet(list).toArray(new java.lang.Integer[0]);
    }

    static boolean h(java.util.List<java.lang.Integer> list) {
        return c(list).length >= 3;
    }

    static java.util.List i(java.util.List list) {
        java.util.List list2 = list;
        int i = 0;
        while (i <= 0) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    if (list2.get(i2) instanceof java.util.List) {
                        arrayList.addAll((java.util.Collection) list2.get(i2));
                    } else {
                        arrayList.add(list2.get(i2));
                    }
                }
                i++;
                list2 = arrayList;
            } catch (java.lang.Exception unused) {
                return list;
            }
        }
        return list2;
    }

    static int d(java.lang.String str) {
        return java.lang.Math.round(str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length / 1000.0f);
    }
}
