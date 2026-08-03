package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass1;
import com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass2;

/* loaded from: classes5.dex */
public final class jp {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.jp f2877;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.util.List<android.view.View> f2878 = new java.util.ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.util.List<com.ironsource.adqualitysdk.sdk.i.jv> f2879 = new java.util.ArrayList();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.util.List<android.view.View> f2881 = new java.util.ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.iw f2880 = new com.ironsource.adqualitysdk.sdk.i.iw() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.4
        @Override // com.ironsource.adqualitysdk.sdk.i.iw
        /* renamed from: ｋ */
        public final void mo7409() {
            java.util.List<android.view.View> m8402 = com.ironsource.adqualitysdk.sdk.i.ki.m8402();
            com.ironsource.adqualitysdk.sdk.i.jp.this.f2881.clear();
            com.ironsource.adqualitysdk.sdk.i.jp.this.f2881.addAll(com.ironsource.adqualitysdk.sdk.i.jp.this.f2878);
            for (int i = 0; i < m8402.size(); i++) {
                android.view.View view = m8402.get(i);
                com.ironsource.adqualitysdk.sdk.i.jp.this.f2881.remove(view);
                if (!com.ironsource.adqualitysdk.sdk.i.jp.this.f2878.contains(view)) {
                    com.ironsource.adqualitysdk.sdk.i.jp.this.f2878.add(view);
                    com.ironsource.adqualitysdk.sdk.i.jp.this.m8260(view);
                }
            }
            for (int i2 = 0; i2 < com.ironsource.adqualitysdk.sdk.i.jp.this.f2881.size(); i2++) {
                android.view.View view2 = (android.view.View) com.ironsource.adqualitysdk.sdk.i.jp.this.f2881.get(i2);
                com.ironsource.adqualitysdk.sdk.i.jp.this.f2878.remove(view2);
                com.ironsource.adqualitysdk.sdk.i.jp.this.m8257(view2);
            }
            com.ironsource.adqualitysdk.sdk.i.jp.this.f2881.clear();
        }
    };

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized com.ironsource.adqualitysdk.sdk.i.jp m8255() {
        com.ironsource.adqualitysdk.sdk.i.jp jpVar;
        synchronized (com.ironsource.adqualitysdk.sdk.i.jp.class) {
            if (f2877 == null) {
                f2877 = new com.ironsource.adqualitysdk.sdk.i.jp();
            }
            jpVar = f2877;
        }
        return jpVar;
    }

    private jp() {
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8263(final com.ironsource.adqualitysdk.sdk.i.jv jvVar) {
        synchronized (this) {
            this.f2879.add(jvVar);
        }
        com.ironsource.adqualitysdk.sdk.i.p.m8554(com.ironsource.adqualitysdk.sdk.i.jo.m8245().new AnonymousClass1(this.f2880));
        com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                java.util.Iterator it = com.ironsource.adqualitysdk.sdk.i.jp.this.f2878.iterator();
                while (it.hasNext()) {
                    jvVar.mo5784((android.view.View) it.next());
                }
            }
        });
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8262(com.ironsource.adqualitysdk.sdk.i.jv jvVar) {
        synchronized (this) {
            this.f2879.remove(jvVar);
            if (this.f2879.size() == 0) {
                com.ironsource.adqualitysdk.sdk.i.p.m8554(com.ironsource.adqualitysdk.sdk.i.jo.m8245().new AnonymousClass2(this.f2880));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public synchronized void m8260(android.view.View view) {
        java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jv> it = this.f2879.iterator();
        while (it.hasNext()) {
            it.next().mo5784(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ｋ, reason: contains not printable characters */
    public synchronized void m8257(android.view.View view) {
        java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jv> it = this.f2879.iterator();
        while (it.hasNext()) {
            it.next().mo5781(view);
        }
    }
}
