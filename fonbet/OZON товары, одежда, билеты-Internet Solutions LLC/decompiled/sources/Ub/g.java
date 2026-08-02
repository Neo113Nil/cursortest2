package Ub;

import Ub.o;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import jc.C7336c;

/* loaded from: classes.dex */
final class g extends d {

    /* renamed from: a, reason: collision with root package name */
    private final TextView.BufferType f27500a;

    /* renamed from: b, reason: collision with root package name */
    private final If.c f27501b;

    /* renamed from: c, reason: collision with root package name */
    private final m f27502c;

    /* renamed from: d, reason: collision with root package name */
    private final List<h> f27503d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f27504e;

    g(@NonNull TextView.BufferType bufferType, @NonNull If.c cVar, @NonNull m mVar, @NonNull List list, boolean z11) {
        this.f27500a = bufferType;
        this.f27501b = cVar;
        this.f27502c = mVar;
        this.f27503d = list;
        this.f27504e = z11;
    }

    @Override // Ub.d
    public final h b() {
        h hVar = null;
        for (h hVar2 : this.f27503d) {
            if (C7336c.class.isAssignableFrom(hVar2.getClass())) {
                hVar = hVar2;
            }
        }
        return hVar;
    }

    @Override // Ub.d
    @NonNull
    public final Hf.u c(@NonNull String str) {
        Iterator<h> it = this.f27503d.iterator();
        while (it.hasNext()) {
            str = it.next().processMarkdown(str);
        }
        return this.f27501b.a(str);
    }

    @Override // Ub.d
    @NonNull
    public final Spanned d(@NonNull Hf.u uVar) {
        List<h> list = this.f27503d;
        Iterator<h> it = list.iterator();
        while (it.hasNext()) {
            it.next().beforeRender(uVar);
        }
        m mVar = this.f27502c;
        mVar.getClass();
        l b11 = ((o.a) mVar.f27508a).b(mVar.f27509b, new s());
        uVar.a(b11);
        Iterator<h> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().afterRender(uVar, b11);
        }
        return ((o) b11).d().h();
    }

    @Override // Ub.d
    public final void e(@NonNull TextView textView, @NonNull Spanned spanned) {
        List<h> list = this.f27503d;
        Iterator<h> it = list.iterator();
        while (it.hasNext()) {
            it.next().beforeSetText(textView, spanned);
        }
        textView.setText(spanned, this.f27500a);
        Iterator<h> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().afterSetText(textView);
        }
    }

    @Override // Ub.d
    @NonNull
    public final SpannableStringBuilder f(@NonNull String str) {
        Spanned d11 = d(c(str));
        return (TextUtils.isEmpty(d11) && this.f27504e && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : (SpannableStringBuilder) d11;
    }
}
