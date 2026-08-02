package androidx.fragment.app;

import androidx.arch.core.util.Function;
import androidx.work.impl.model.WorkSpec;
import com.facebook.internal.C0715k;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.MediaParserExtractorAdapter;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Function, C0715k.a, ProgressiveMediaExtractor.Factory {
    public static String a(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        List WORK_INFO_MAPPER$lambda$1;
        WORK_INFO_MAPPER$lambda$1 = WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
        return WORK_INFO_MAPPER$lambda$1;
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.w.p = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return new MediaParserExtractorAdapter(playerId);
    }
}
