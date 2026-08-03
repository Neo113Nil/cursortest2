package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public abstract class a implements com.fyber.inneractive.sdk.flow.endcard.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3682a = com.fyber.inneractive.sdk.util.IAlog.a(this);
    public final com.fyber.inneractive.sdk.flow.endcard.b b;

    public a(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
        this.b = bVar;
    }

    public static android.view.ViewGroup a(android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(view.getContext()).inflate(com.fyber.inneractive.sdk.R.layout.ia_endcard_container, (android.view.ViewGroup) null);
        viewGroup.addView(view);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
        return viewGroup;
    }

    public void c() {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        a();
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
    }
}
