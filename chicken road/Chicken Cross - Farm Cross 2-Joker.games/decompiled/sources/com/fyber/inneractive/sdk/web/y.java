package com.fyber.inneractive.sdk.web;

import android.content.DialogInterface;
import android.os.Environment;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.File;

/* loaded from: classes4.dex */
public final class y implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6023a;
    public final /* synthetic */ i0 b;

    public y(i0 i0Var, String str) {
        this.b = i0Var;
        this.f6023a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        i0 i0Var = this.b;
        String str = this.f6023a;
        i0Var.getClass();
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        com.fyber.inneractive.sdk.flow.x xVar = i0Var.s;
        IAConfigManager.R.s.a(new com.fyber.inneractive.sdk.network.b1(new x(i0Var), str, xVar != null ? xVar.c : null));
    }
}
