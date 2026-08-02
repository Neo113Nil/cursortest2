package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.j;

/* loaded from: classes4.dex */
public final class o implements View.OnClickListener {
    public final /* synthetic */ j a;

    public o(j jVar) {
        this.a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.a;
        j.d dVar = jVar.i;
        j.d dVar2 = j.d.a;
        j.d dVar3 = j.d.b;
        if (dVar == dVar3) {
            jVar.g(dVar2);
        } else if (dVar == dVar2) {
            jVar.g(dVar3);
        }
    }
}
