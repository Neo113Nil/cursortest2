package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.ud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4133ud extends ContentObserver implements Zc {

    /* renamed from: a, reason: collision with root package name */
    public final String f7414a;
    public final Context b;
    public int c;
    public final /* synthetic */ C4187wd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4133ud(C4187wd c4187wd, String mJsCallbackNamespace, Context context, Handler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(mJsCallbackNamespace, "mJsCallbackNamespace");
        this.d = c4187wd;
        this.f7414a = mJsCallbackNamespace;
        this.b = context;
        this.c = -1;
    }

    @Override // com.inmobi.media.Zc
    public final void a() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // com.inmobi.media.Zc
    public final void b() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C4104td(this, this.d, z, null), 3, null);
    }
}
