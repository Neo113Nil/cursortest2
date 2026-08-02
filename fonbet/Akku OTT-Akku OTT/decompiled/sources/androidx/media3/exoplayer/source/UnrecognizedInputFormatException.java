package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import com.google.common.collect.G;
import com.google.common.collect.i0;
import java.util.List;

@UnstableApi
/* loaded from: classes3.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final G<SniffFailure> sniffFailures;
    public final Uri uri;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, i0.e);
        G.b bVar = G.b;
    }

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = G.j(list);
    }
}
