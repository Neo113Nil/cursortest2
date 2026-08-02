package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.google.common.collect.AbstractC5880y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l3.C7855a;
import x4.C10655a;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private List<C7855a> f44194a;

    /* renamed from: b, reason: collision with root package name */
    private C10655a f44195b;

    /* renamed from: c, reason: collision with root package name */
    private float f44196c;

    /* renamed from: d, reason: collision with root package name */
    private float f44197d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44198e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44199f;

    /* renamed from: g, reason: collision with root package name */
    private a f44200g;

    /* renamed from: h, reason: collision with root package name */
    private View f44201h;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44194a = Collections.EMPTY_LIST;
        this.f44195b = C10655a.f105010g;
        this.f44196c = 0.0533f;
        this.f44197d = 0.08f;
        this.f44198e = true;
        this.f44199f = true;
        a aVar = new a(context);
        this.f44200g = aVar;
        this.f44201h = aVar;
        addView(aVar);
    }

    private void d() {
        List<C7855a> list;
        a aVar = this.f44200g;
        boolean z11 = this.f44199f;
        boolean z12 = this.f44198e;
        if (z12 && z11) {
            list = this.f44194a;
        } else {
            ArrayList arrayList = new ArrayList(this.f44194a.size());
            for (int i11 = 0; i11 < this.f44194a.size(); i11++) {
                C7855a.C1210a a11 = this.f44194a.get(i11).a();
                if (!z12) {
                    x.a(a11);
                } else if (!z11) {
                    x.b(a11);
                }
                arrayList.add(a11.a());
            }
            list = arrayList;
        }
        aVar.a(list, this.f44195b, this.f44196c, this.f44197d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    public final void a(AbstractC5880y abstractC5880y) {
        AbstractC5880y abstractC5880y2 = abstractC5880y;
        if (abstractC5880y == null) {
            abstractC5880y2 = Collections.EMPTY_LIST;
        }
        this.f44194a = abstractC5880y2;
        d();
    }

    public final void b() {
        CaptioningManager captioningManager;
        boolean isInEditMode = isInEditMode();
        C10655a c10655a = C10655a.f105010g;
        if (!isInEditMode && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            c10655a = C10655a.a(captioningManager.getUserStyle());
        }
        this.f44195b = c10655a;
        d();
    }

    public final void c() {
        CaptioningManager captioningManager;
        float f7 = 1.0f;
        if (!isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            f7 = captioningManager.getFontScale();
        }
        this.f44196c = f7 * 0.0533f;
        d();
    }
}
