package org.betup.ui.fragment.balance;

import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.user.balance.BalanceActionModel;
import org.betup.model.remote.entity.user.balance.BalanceDataModel;
import org.modelmapper.internal.asm.signature.SignatureVisitor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BalanceHistoryLabelFormatter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/balance/BalanceHistoryLabelFormatter;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "WEB_GAME_BET_ACTION_ID", "", "WEB_GAME_WIN_ACTION_ID", "formatActionLabel", "", "balanceData", "Lorg/betup/model/remote/entity/user/balance/BalanceDataModel;", "gameNamesByCode", "", "webGameBetLabel", "webGameWinLabel", "formatGameCodeFallback", TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BalanceHistoryLabelFormatter {
    public static final int $stable = 0;
    public static final BalanceHistoryLabelFormatter INSTANCE = new BalanceHistoryLabelFormatter();
    public static final int WEB_GAME_BET_ACTION_ID = 53;
    public static final int WEB_GAME_WIN_ACTION_ID = 54;

    private BalanceHistoryLabelFormatter() {
    }

    public final String formatActionLabel(BalanceDataModel balanceData, Map<String, String> gameNamesByCode, String webGameBetLabel, String webGameWinLabel) {
        Intrinsics.checkNotNullParameter(balanceData, "balanceData");
        Intrinsics.checkNotNullParameter(gameNamesByCode, "gameNamesByCode");
        Intrinsics.checkNotNullParameter(webGameBetLabel, "webGameBetLabel");
        Intrinsics.checkNotNullParameter(webGameWinLabel, "webGameWinLabel");
        BalanceActionModel action = balanceData.getAction();
        if (action == null) {
            return "";
        }
        String name = action.getName();
        if (name == null) {
            name = "";
        }
        String contextCode = balanceData.getContextCode();
        String obj = contextCode != null ? StringsKt.trim((CharSequence) contextCode).toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (obj.length() == 0) {
            return name;
        }
        int id = action.getId();
        if (id != 53 && id != 54) {
            return name;
        }
        String str = gameNamesByCode.get(obj);
        String obj2 = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        String str2 = obj2 != null ? obj2 : "";
        if (str2.length() == 0) {
            str2 = INSTANCE.formatGameCodeFallback(obj);
        }
        String str3 = str2;
        if (id != 53) {
            webGameBetLabel = webGameWinLabel;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), webGameBetLabel, Arrays.copyOf(new Object[]{str3}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final String formatGameCodeFallback(String code) {
        List split$default = StringsKt.split$default((CharSequence) code, new char[]{SignatureVisitor.SUPER, '_'}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, new Function1() { // from class: org.betup.ui.fragment.balance.BalanceHistoryLabelFormatter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CharSequence formatGameCodeFallback$lambda$3;
                formatGameCodeFallback$lambda$3 = BalanceHistoryLabelFormatter.formatGameCodeFallback$lambda$3((String) obj2);
                return formatGameCodeFallback$lambda$3;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formatGameCodeFallback$lambda$3(String word) {
        String valueOf;
        Intrinsics.checkNotNullParameter(word, "word");
        if (word.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = word.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                valueOf = CharsKt.titlecase(charAt, locale);
            } else {
                valueOf = String.valueOf(charAt);
            }
            StringBuilder append = sb.append((Object) valueOf);
            String substring = word.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            word = append.append(substring).toString();
        }
        return word;
    }
}
