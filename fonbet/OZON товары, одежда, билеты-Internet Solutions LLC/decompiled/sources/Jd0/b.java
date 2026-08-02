package Jd0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import zd0.c;

/* loaded from: classes3.dex */
public final class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14621a;

        static {
            int[] iArr = new int[NotificationBar.DismissReason.values().length];
            try {
                iArr[NotificationBar.DismissReason.SWIPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationBar.DismissReason.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationBar.DismissReason.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationBar.DismissReason.MANUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NotificationBar.DismissReason.CONSECUTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14621a = iArr;
        }
    }

    @NotNull
    public static final c.C2348c a(@NotNull TokenizedTrackingInfo tokenizedTrackingInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(tokenizedTrackingInfo, "<this>");
        String actionType = tokenizedTrackingInfo.getActionType();
        String key = tokenizedTrackingInfo.getKey();
        String sliceKey = tokenizedTrackingInfo.getSliceKey();
        List<TokenizedTrackingInfo> nested = tokenizedTrackingInfo.getNested();
        if (nested != null) {
            List<TokenizedTrackingInfo> list = nested;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a((TokenizedTrackingInfo) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new c.C2348c(actionType, key, sliceKey, arrayList, tokenizedTrackingInfo.getCustom());
    }
}
