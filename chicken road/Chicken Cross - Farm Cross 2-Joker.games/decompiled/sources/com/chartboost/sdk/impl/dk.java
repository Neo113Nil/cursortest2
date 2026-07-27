package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import java.net.URL;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public interface dk {
    long a();

    View a(Context context);

    Object a(Context context, URL url, w6 w6Var, Continuation continuation);

    void a(ek ekVar);

    void a(gh ghVar);

    Bitmap b();

    long c();

    float getVolume();

    void pause();

    void play();

    void release();

    void setVolume(float f);
}
