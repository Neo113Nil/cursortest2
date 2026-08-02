package Xb;

import Vb.r;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class g extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    private final r f34257a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34258b;

    /* renamed from: c, reason: collision with root package name */
    private final Ub.b f34259c;

    public g(@NonNull r rVar, @NonNull String str, @NonNull Ub.b bVar) {
        super(str);
        this.f34257a = rVar;
        this.f34258b = str;
        this.f34259c = bVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f34259c.resolve(view, this.f34258b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NonNull TextPaint textPaint) {
        this.f34257a.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
