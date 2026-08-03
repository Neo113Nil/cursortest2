package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class h extends com.fyber.inneractive.sdk.mraid.e {
    public h(java.util.LinkedHashMap linkedHashMap, com.fyber.inneractive.sdk.web.i0 i0Var, com.fyber.inneractive.sdk.util.g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        com.fyber.inneractive.sdk.web.i0 i0Var = this.c;
        java.util.Map map = this.b;
        android.content.Context a2 = com.fyber.inneractive.sdk.util.o.a(i0Var.b);
        try {
            java.util.HashMap a3 = com.fyber.inneractive.sdk.web.i0.a(map);
            android.content.Intent type = new android.content.Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
            for (java.lang.String str : a3.keySet()) {
                java.lang.Object obj = a3.get(str);
                if (obj instanceof java.lang.Long) {
                    type.putExtra(str, ((java.lang.Long) obj).longValue());
                } else if (obj instanceof java.lang.Integer) {
                    type.putExtra(str, ((java.lang.Integer) obj).intValue());
                } else {
                    type.putExtra(str, (java.lang.String) obj);
                }
            }
            if (!(a2 instanceof android.app.Activity)) {
                type.setFlags(268435456);
            }
            a2.startActivity(type);
            com.fyber.inneractive.sdk.web.j1 j1Var = i0Var.g;
            if (j1Var != null) {
                ((com.fyber.inneractive.sdk.web.b0) j1Var).e();
            }
        } catch (android.content.ActivityNotFoundException unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("There is no calendar app installed!", new java.lang.Object[0]);
            i0Var.a(com.fyber.inneractive.sdk.mraid.k.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
        } catch (java.lang.IllegalArgumentException e) {
            com.fyber.inneractive.sdk.util.IAlog.a("invalid parameters for create calendar ", e.getMessage());
            i0Var.a(com.fyber.inneractive.sdk.mraid.k.CREATE_CALENDAR_EVENT, e.getMessage());
        } catch (java.lang.Throwable unused2) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed to create calendar event.", new java.lang.Object[0]);
            i0Var.a(com.fyber.inneractive.sdk.mraid.k.CREATE_CALENDAR_EVENT, "could not create calendar event");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final java.lang.String c() {
        return null;
    }
}
