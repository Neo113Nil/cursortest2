package p000;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh1 {
    /* JADX INFO: renamed from: a */
    public static String[] m5909a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C0549om m5910b(View view, C0549om c0549om) {
        ContentInfo contentInfoMo3051c = c0549om.f5786a.mo3051c();
        Objects.requireNonNull(contentInfoMo3051c);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo3051c);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo3051c ? c0549om : new C0549om(new C0401km(contentInfoPerformReceiveContent));
    }
}
