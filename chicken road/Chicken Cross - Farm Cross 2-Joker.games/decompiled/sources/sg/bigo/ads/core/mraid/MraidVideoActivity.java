package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.k1.S;
import sg.bigo.ads.k1.T;

/* loaded from: classes3.dex */
public class MraidVideoActivity extends Activity {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public MediaView f12719a;
    public VideoController b;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            String stringExtra = getIntent().getStringExtra("INTENT_VIDEO_URL");
            MediaView mediaView = new MediaView(this);
            this.f12719a = mediaView;
            mediaView.a(stringExtra);
            this.b = this.f12719a.getVideoController();
            this.f12719a.setOnClickListener(new S(this));
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.bigo_ad_ic_close);
            imageView.setOnClickListener(new T(this));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            frameLayout.addView(this.f12719a, new FrameLayout.LayoutParams(-1, -2, 17));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC4963u.a(this, 25), AbstractC4963u.a(this, 25), 8388659);
            layoutParams.leftMargin = AbstractC4963u.a(this, 15);
            layoutParams.topMargin = AbstractC4963u.a(this, 25);
            frameLayout.addView(imageView, layoutParams);
            setContentView(frameLayout);
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            VideoController videoController = this.b;
            if (videoController != null) {
                videoController.pause();
            }
            MediaView mediaView = this.f12719a;
            if (mediaView != null) {
                mediaView.destroy();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            VideoController videoController = this.b;
            if (videoController != null) {
                videoController.pause();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            VideoController videoController = this.b;
            if (videoController != null) {
                videoController.play();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
