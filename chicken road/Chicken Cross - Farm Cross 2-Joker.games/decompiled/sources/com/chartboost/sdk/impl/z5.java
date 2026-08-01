package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerView;
import com.chartboost.sdk.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z5 implements se {
    @Override // com.chartboost.sdk.impl.se
    public PlayerView a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.cb_player_view, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        return (PlayerView) inflate;
    }
}
