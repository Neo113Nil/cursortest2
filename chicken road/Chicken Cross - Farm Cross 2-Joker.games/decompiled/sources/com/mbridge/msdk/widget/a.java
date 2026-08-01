package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* compiled from: MBridgeNoDoubleClick.java */
/* loaded from: classes6.dex */
public abstract class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private long f10360a = 0;

    protected abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f10360a > 2000) {
            this.f10360a = timeInMillis;
            a(view);
        }
    }
}
