package Ub;

import If.c;
import Ub.f;
import Ub.h;
import Ub.j;
import Ub.l;
import Vb.r;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class a implements h {
    @Override // Ub.h
    public void afterRender(@NonNull Hf.u uVar, @NonNull l lVar) {
    }

    @Override // Ub.h
    public void afterSetText(@NonNull TextView textView) {
    }

    @Override // Ub.h
    public void beforeRender(@NonNull Hf.u uVar) {
    }

    @Override // Ub.h
    public void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned) {
    }

    @Override // Ub.h
    public void configure(@NonNull h.b bVar) {
    }

    @Override // Ub.h
    public void configureConfiguration(@NonNull f.a aVar) {
    }

    @Override // Ub.h
    public void configureParser(@NonNull c.a aVar) {
    }

    @Override // Ub.h
    public void configureSpansFactory(@NonNull j.a aVar) {
    }

    @Override // Ub.h
    public void configureTheme(@NonNull r.a aVar) {
    }

    @Override // Ub.h
    public void configureVisitor(@NonNull l.a aVar) {
    }

    @Override // Ub.h
    @NonNull
    public String processMarkdown(@NonNull String str) {
        return str;
    }
}
