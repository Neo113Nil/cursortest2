package sg.bigo.ads.H;

import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Locale;
import java.util.regex.Pattern;
import sg.bigo.ads.K0.E;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class f extends E {
    public final /* synthetic */ g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, long j) {
        super(j, 1000L);
        this.i = gVar;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
        TextView textView = this.i.b;
        int round = Math.round(j / 1000.0f);
        Pattern pattern = I.f12345a;
        Locale locale = Locale.ENGLISH;
        textView.setText(round + CmcdData.Factory.STREAMING_FORMAT_SS);
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        g gVar = this.i;
        gVar.f = true;
        gVar.c.setAlpha(1.0f);
        this.i.c.setClickable(true);
        this.i.b.setVisibility(8);
        this.i.f12313a.setTextColor(-1);
    }
}
