package androidx.core.widget;

import Z.u;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    long f42391a;

    /* renamed from: b, reason: collision with root package name */
    boolean f42392b;

    /* renamed from: c, reason: collision with root package name */
    boolean f42393c;

    /* renamed from: d, reason: collision with root package name */
    boolean f42394d;

    /* renamed from: e, reason: collision with root package name */
    private final d f42395e;

    /* renamed from: f, reason: collision with root package name */
    private final e f42396f;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.core.widget.d] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.core.widget.e] */
    public ContentLoadingProgressBar(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f42391a = -1L;
        this.f42392b = false;
        this.f42393c = false;
        this.f42394d = false;
        this.f42395e = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
                contentLoadingProgressBar.f42392b = false;
                contentLoadingProgressBar.f42391a = -1L;
                contentLoadingProgressBar.setVisibility(8);
            }
        };
        this.f42396f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
                contentLoadingProgressBar.f42393c = false;
                if (contentLoadingProgressBar.f42394d) {
                    return;
                }
                contentLoadingProgressBar.f42391a = System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
            }
        };
    }

    public static void a(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f42391a = -1L;
        contentLoadingProgressBar.f42394d = false;
        contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.f42395e);
        contentLoadingProgressBar.f42392b = false;
        if (contentLoadingProgressBar.f42393c) {
            return;
        }
        contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.f42396f, 500L);
        contentLoadingProgressBar.f42393c = true;
    }

    public static void b(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f42394d = true;
        contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.f42396f);
        contentLoadingProgressBar.f42393c = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = contentLoadingProgressBar.f42391a;
        long j12 = currentTimeMillis - j11;
        if (j12 >= 500 || j11 == -1) {
            contentLoadingProgressBar.setVisibility(8);
        } else {
            if (contentLoadingProgressBar.f42392b) {
                return;
            }
            contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.f42395e, 500 - j12);
            contentLoadingProgressBar.f42392b = true;
        }
    }

    public final void c() {
        post(new u(this, 3));
    }

    public final void d() {
        post(new GE.b(this, 4));
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f42395e);
        removeCallbacks(this.f42396f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f42395e);
        removeCallbacks(this.f42396f);
    }
}
