package org.betup.games.webgame;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.domain.RemoteConfigConstants;
import org.betup.utils.SharedPrefs;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WebGameWinVideoConfig.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/games/webgame/WebGameWinVideoConfig;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "WIN_VIDEO_BONUS_GAME_CODES", "", "", "FLASH_ROULETTE_REFERENCED_VALUE", "", "supportsWinVideoBonus", "", "gameCode", "shouldShowWinVideoBonusDialog", "context", "Landroid/content/Context;", "adsAllowedForUser", "apiReferencedValue", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebGameWinVideoConfig {
    public static final long FLASH_ROULETTE_REFERENCED_VALUE = 1000;
    public static final WebGameWinVideoConfig INSTANCE = new WebGameWinVideoConfig();
    private static final Set<String> WIN_VIDEO_BONUS_GAME_CODES = SetsKt.setOf((Object[]) new String[]{"dice", "war", "higher-lower", "head-tails-coin", "plinko", "slot-machine", "lucky-cells"});
    public static final int $stable = 8;

    public final long apiReferencedValue() {
        return 1000L;
    }

    private WebGameWinVideoConfig() {
    }

    public final boolean supportsWinVideoBonus(String gameCode) {
        Intrinsics.checkNotNullParameter(gameCode, "gameCode");
        Set<String> set = WIN_VIDEO_BONUS_GAME_CODES;
        String lowerCase = StringsKt.trim((CharSequence) gameCode).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return set.contains(lowerCase);
    }

    public final boolean shouldShowWinVideoBonusDialog(Context context, boolean adsAllowedForUser) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!adsAllowedForUser) {
            return false;
        }
        long j = FirebaseRemoteConfig.getInstance().getLong(RemoteConfigConstants.WEB_GAME_WIN_DOUBLE_DIALOG_INTERVAL);
        return j > 0 && ((long) SharedPrefs.getWebGameWinDoubleDialogWins(context)) >= j;
    }
}
