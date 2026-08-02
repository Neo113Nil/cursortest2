package p000;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.HashMap;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bc0 extends AbstractC0057bc {

    /* JADX INFO: renamed from: d */
    public FiamFrameLayout f816d;

    /* JADX INFO: renamed from: e */
    public ImageView f817e;

    /* JADX INFO: renamed from: f */
    public Button f818f;

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: c */
    public final ImageView mo631c() {
        return this.f817e;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: d */
    public final ViewGroup mo632d() {
        return this.f816d;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: e */
    public final ViewTreeObserver.OnGlobalLayoutListener mo633e(HashMap map, y00 y00Var) {
        View viewInflate = this.f815c.inflate(R.layout.image, (ViewGroup) null);
        this.f816d = (FiamFrameLayout) viewInflate.findViewById(R.id.image_root);
        this.f817e = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f818f = (Button) viewInflate.findViewById(R.id.collapse_button);
        ImageView imageView = this.f817e;
        ad0 ad0Var = this.f814b;
        imageView.setMaxHeight(ad0Var.m177a());
        this.f817e.setMaxWidth(ad0Var.m178b());
        zc0 zc0Var = this.f813a;
        if (zc0Var.f9732a.equals(MessageType.IMAGE_ONLY)) {
            gc0 gc0Var = (gc0) zc0Var;
            ImageView imageView2 = this.f817e;
            cc0 cc0Var = gc0Var.f2692c;
            imageView2.setVisibility((cc0Var == null || TextUtils.isEmpty(cc0Var.f1215a)) ? 8 : 0);
            this.f817e.setOnClickListener((View.OnClickListener) map.get(gc0Var.f2693d));
        }
        this.f816d.setDismissListener(y00Var);
        this.f818f.setOnClickListener(y00Var);
        return null;
    }
}
