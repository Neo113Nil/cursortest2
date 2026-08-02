package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5079y {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private TextView f38005a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f38006b;

    /* renamed from: androidx.appcompat.widget.y$a */
    /* loaded from: classes8.dex */
    private static final class a {
        @NonNull
        static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    C5079y(@NonNull TextView textView) {
        this.f38005a = textView;
    }

    @NonNull
    public final TextClassifier a() {
        TextClassifier textClassifier = this.f38006b;
        return textClassifier == null ? a.a(this.f38005a) : textClassifier;
    }

    public final void b(TextClassifier textClassifier) {
        this.f38006b = textClassifier;
    }
}
