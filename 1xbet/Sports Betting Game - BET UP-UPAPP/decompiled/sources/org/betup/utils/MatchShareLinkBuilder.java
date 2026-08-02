package org.betup.utils;

import androidx.collection.SieveCacheKt;
import com.tiktok.util.UrlConst;
import io.sentry.protocol.OperatingSystem;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.betup.BuildConfig;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchShareLinkBuilder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lorg/betup/utils/MatchShareLinkBuilder;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", OperatingSystem.JsonKeys.BUILD, "", "matchId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchShareLinkBuilder {
    public static final int $stable = 0;
    public static final MatchShareLinkBuilder INSTANCE = new MatchShareLinkBuilder();

    private MatchShareLinkBuilder() {
    }

    public final String build(long matchId) {
        String encodeMatch;
        if (matchId <= 0 || matchId > SieveCacheKt.NodeLinkMask || (encodeMatch = ShareInstallLinkCodec.encodeMatch((int) matchId)) == null) {
            return null;
        }
        String trimEnd = StringsKt.trimEnd(StringsKt.trim((CharSequence) BuildConfig.MATCH_SHARE_LINK_HOST).toString(), '/');
        if (trimEnd.length() == 0) {
            return null;
        }
        return UrlConst.HTTPS + trimEnd + "/share/" + encodeMatch;
    }
}
