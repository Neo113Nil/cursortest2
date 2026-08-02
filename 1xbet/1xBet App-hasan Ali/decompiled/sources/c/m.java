package c;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends View {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f7362k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Context context) {
        super(context);
        this.f7362k = lVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.l.f("newConfig", configuration);
        this.f7362k.run();
    }
}
