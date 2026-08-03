package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1636gi extends com.facebook.ads.redexgen.core.T8 {
    public static java.lang.String[] A06 = {"4Fl94EIzOk67aYUPduHJ8UazEL", "sAhktSZOOrm35xxj8Imdq8RPkj", "oRYwVa3KjTvntAfrBK1sqTqE8vcnrhu1", "DAigVkrFkMuOUy14T2FK5zmWgvJcIn3a", "an5oIaHMQLp81wCZBnKMJTBSx7KtQFJf", "wEWpxEoKGSO43ttKCSegU3t35jPnkl3s", "WpWdxAQuBweGThqHfmbUTgqTG7", "dWX8I2VlCkDjmK6jHvJYkvPP690yaesv"};
    public java.lang.ref.WeakReference<android.app.Activity> A00;
    public java.util.WeakHashMap<com.facebook.ads.internal.context.Repairable, java.lang.Boolean> A01;
    public final com.facebook.ads.redexgen.core.T6 A02;
    public final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.T5> A03;
    public final java.util.concurrent.atomic.AtomicReference<java.lang.Object> A04;
    public final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.InterfaceC0862Lt> A05;

    public C1636gi(android.app.Activity activity, com.facebook.ads.redexgen.core.TA ta, com.facebook.ads.redexgen.core.InterfaceC0862Lt interfaceC0862Lt) {
        super(activity.getApplicationContext(), ta);
        this.A01 = new java.util.WeakHashMap<>();
        this.A05 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A03 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A02 = new com.facebook.ads.redexgen.core.T6();
        this.A04 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A05.set(interfaceC0862Lt);
        this.A00 = new java.lang.ref.WeakReference<>(activity);
    }

    public C1636gi(android.content.Context context, com.facebook.ads.redexgen.core.TA ta, com.facebook.ads.redexgen.core.InterfaceC0862Lt interfaceC0862Lt) {
        super(context.getApplicationContext(), ta);
        this.A01 = new java.util.WeakHashMap<>();
        this.A05 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A03 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A02 = new com.facebook.ads.redexgen.core.T6();
        this.A04 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A05.set(interfaceC0862Lt);
        android.app.Activity A00 = A00(context);
        if (A00 != null) {
            this.A00 = new java.lang.ref.WeakReference<>(A00);
        } else {
            this.A00 = new java.lang.ref.WeakReference<>(null);
        }
    }

    public static android.app.Activity A00(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            if ((context instanceof com.facebook.ads.redexgen.core.C1636gi) && ((com.facebook.ads.redexgen.core.C1636gi) context).A0E() != null) {
                return ((com.facebook.ads.redexgen.core.C1636gi) context).A0E();
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final android.app.Activity A0E() {
        return this.A00.get();
    }

    public com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F() {
        com.facebook.ads.redexgen.core.InterfaceC0862Lt funnel = this.A05.get();
        if (funnel == null) {
            return new com.facebook.ads.redexgen.core.C1856kX();
        }
        return funnel;
    }

    public final com.facebook.ads.redexgen.core.T5 A0G() {
        return this.A03.get();
    }

    public final com.facebook.ads.redexgen.core.T6 A0H() {
        return this.A02;
    }

    public final java.lang.Object A0I() {
        return this.A04.get();
    }

    public final void A0J(android.app.Activity activity) {
        this.A00 = new java.lang.ref.WeakReference<>(activity);
    }

    public final void A0K(com.facebook.ads.redexgen.core.InterfaceC0862Lt interfaceC0862Lt) {
        this.A05.set(interfaceC0862Lt);
    }

    public final void A0L(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        c1636gi.A01.putAll(this.A01);
        this.A01 = c1636gi.A01;
    }

    public final void A0M(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        A0K(c1636gi.A0F());
        A0D(c1636gi.A0C());
        A0N(c1636gi.A0G());
    }

    public final void A0N(com.facebook.ads.redexgen.core.T5 t5) {
        this.A03.set(t5);
    }

    public final void A0O(com.facebook.ads.internal.context.Repairable repairable) {
        this.A01.put(repairable, true);
    }

    public final void A0P(java.lang.Object obj) {
        this.A04.set(obj);
    }

    public final void A0Q(java.lang.Throwable th) {
        java.util.Iterator<java.util.Map.Entry<com.facebook.ads.internal.context.Repairable, java.lang.Boolean>> it = this.A01.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String[] strArr = A06;
            if (strArr[4].charAt(18) == strArr[2].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[0] = "cq4W2mN05Su2gaFDi5CYFjM7nJ";
            strArr2[6] = "g7MgkZWMqMCaiMVBRzNoHUUy7c";
            if (hasNext) {
                it.next().getKey().repair(th);
            } else {
                return;
            }
        }
    }
}
