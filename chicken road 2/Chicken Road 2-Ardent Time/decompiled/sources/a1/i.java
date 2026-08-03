package a1;

/* loaded from: classes.dex */
public final class i implements a1.l {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.i f1948a = new a1.i();

    @Override // a1.l
    public java.nio.ByteBuffer a(java.lang.Object obj) {
        org.json.JSONArray put = new org.json.JSONArray().put(u0.AbstractC0995a.G(obj));
        if (put == null) {
            return null;
        }
        java.lang.Object G = u0.AbstractC0995a.G(put);
        if (G instanceof java.lang.String) {
            a1.p pVar = a1.p.f1952b;
            java.lang.String quote = org.json.JSONObject.quote((java.lang.String) G);
            pVar.getClass();
            return a1.p.b(quote);
        }
        a1.p pVar2 = a1.p.f1952b;
        java.lang.String obj2 = G.toString();
        pVar2.getClass();
        return a1.p.b(obj2);
    }

    @Override // a1.l
    public x0.e b(java.nio.ByteBuffer byteBuffer) {
        java.lang.Object nextValue;
        java.lang.Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    a1.p.f1952b.getClass();
                    org.json.JSONTokener jSONTokener = new org.json.JSONTokener(a1.p.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new java.lang.IllegalArgumentException("Invalid JSON");
                    }
                } catch (org.json.JSONException e2) {
                    throw new java.lang.IllegalArgumentException("Invalid JSON", e2);
                }
            } catch (org.json.JSONException e3) {
                throw new java.lang.IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (nextValue instanceof org.json.JSONObject) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) nextValue;
            java.lang.Object obj2 = jSONObject.get("method");
            java.lang.Object opt = jSONObject.opt("args");
            if (opt != org.json.JSONObject.NULL) {
                obj = opt;
            }
            if (obj2 instanceof java.lang.String) {
                return new x0.e(19, (java.lang.String) obj2, obj);
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // a1.l
    public java.lang.Object c(java.nio.ByteBuffer byteBuffer) {
        java.lang.Object nextValue;
        java.lang.Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    a1.p.f1952b.getClass();
                    org.json.JSONTokener jSONTokener = new org.json.JSONTokener(a1.p.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new java.lang.IllegalArgumentException("Invalid JSON");
                    }
                } catch (org.json.JSONException e2) {
                    throw new java.lang.IllegalArgumentException("Invalid JSON", e2);
                }
            } catch (org.json.JSONException e3) {
                throw new java.lang.IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (nextValue instanceof org.json.JSONArray) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) nextValue;
            if (jSONArray.length() == 1) {
                java.lang.Object opt = jSONArray.opt(0);
                if (opt == org.json.JSONObject.NULL) {
                    return null;
                }
                return opt;
            }
            if (jSONArray.length() == 3) {
                java.lang.Object obj2 = jSONArray.get(0);
                java.lang.Object opt2 = jSONArray.opt(1);
                java.lang.Object obj3 = org.json.JSONObject.NULL;
                if (opt2 == obj3) {
                    opt2 = null;
                }
                java.lang.Object opt3 = jSONArray.opt(2);
                if (opt3 != obj3) {
                    obj = opt3;
                }
                if ((obj2 instanceof java.lang.String) && (opt2 == null || (opt2 instanceof java.lang.String))) {
                    throw new a1.g((java.lang.String) obj2, (java.lang.String) opt2, obj);
                }
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid envelope: " + nextValue);
    }

    @Override // a1.l
    public java.nio.ByteBuffer d(java.lang.String str, java.lang.String str2) {
        org.json.JSONArray put = new org.json.JSONArray().put("error").put(u0.AbstractC0995a.G(str)).put(org.json.JSONObject.NULL).put(u0.AbstractC0995a.G(str2));
        if (put == null) {
            return null;
        }
        java.lang.Object G = u0.AbstractC0995a.G(put);
        if (G instanceof java.lang.String) {
            a1.p pVar = a1.p.f1952b;
            java.lang.String quote = org.json.JSONObject.quote((java.lang.String) G);
            pVar.getClass();
            return a1.p.b(quote);
        }
        a1.p pVar2 = a1.p.f1952b;
        java.lang.String obj = G.toString();
        pVar2.getClass();
        return a1.p.b(obj);
    }

    @Override // a1.l
    public java.nio.ByteBuffer e(x0.e eVar) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("method", (java.lang.String) eVar.f8409b);
            jSONObject.put("args", u0.AbstractC0995a.G(eVar.f8410c));
            java.lang.Object G = u0.AbstractC0995a.G(jSONObject);
            if (G instanceof java.lang.String) {
                a1.p pVar = a1.p.f1952b;
                java.lang.String quote = org.json.JSONObject.quote((java.lang.String) G);
                pVar.getClass();
                return a1.p.b(quote);
            }
            a1.p pVar2 = a1.p.f1952b;
            java.lang.String obj = G.toString();
            pVar2.getClass();
            return a1.p.b(obj);
        } catch (org.json.JSONException e2) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // a1.l
    public java.nio.ByteBuffer f(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        org.json.JSONArray put = new org.json.JSONArray().put(str).put(u0.AbstractC0995a.G(str2)).put(u0.AbstractC0995a.G(obj));
        if (put == null) {
            return null;
        }
        java.lang.Object G = u0.AbstractC0995a.G(put);
        if (G instanceof java.lang.String) {
            a1.p pVar = a1.p.f1952b;
            java.lang.String quote = org.json.JSONObject.quote((java.lang.String) G);
            pVar.getClass();
            return a1.p.b(quote);
        }
        a1.p pVar2 = a1.p.f1952b;
        java.lang.String obj2 = G.toString();
        pVar2.getClass();
        return a1.p.b(obj2);
    }
}
