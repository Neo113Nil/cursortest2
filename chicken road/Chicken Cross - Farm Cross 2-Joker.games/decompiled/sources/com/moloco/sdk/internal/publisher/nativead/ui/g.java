package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Function5<BoxScope, Boolean, Function0<Unit>, Composer, Integer, Unit> f10680a = a.f10669a.a();

    public static final Function5<BoxScope, Boolean, Function0<Unit>, Composer, Integer, Unit> a() {
        return f10680a;
    }

    public static final Function3<Context, Flow<Boolean>, Flow<? extends i>, q> b() {
        return new Function3() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.g$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return g.a((Context) obj, (Flow) obj2, (Flow) obj3);
            }
        };
    }

    public static final q a(Context context, Flow isPlaying, Flow progress) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new q(context, isPlaying, progress, -1, 0, Integer.valueOf(R.drawable.moloco_twotone_play_arrow_24), Integer.valueOf(R.drawable.moloco_twotone_pause_24), context.getString(R.string.moloco_playback_control_icon_content_description), context.getString(R.string.moloco_playback_control_parent_content_description), 16, null);
    }
}
