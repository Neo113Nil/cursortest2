package L30;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebChromeClient;
import java.util.ArrayList;
import kd.C7665d;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class b {
    public static final Uri[] a(int i11, Intent intent) {
        Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(i11, intent);
        ClipData clipData = intent != null ? intent.getClipData() : null;
        if (parseResult != null || clipData == null || clipData.getItemCount() <= 0) {
            return parseResult;
        }
        try {
            IntRange intRange = new IntRange(0, clipData.getItemCount() - 1, 1);
            ArrayList arrayList = new ArrayList();
            C7665d it = intRange.iterator();
            while (it.hasNext()) {
                Uri uri = clipData.getItemAt(it.b()).getUri();
                if (uri != null) {
                    arrayList.add(uri);
                }
            }
            return (Uri[]) arrayList.toArray(new Uri[0]);
        } catch (Exception e11) {
            L80.a.c("FileChooserParams", null, e11);
            return null;
        }
    }
}
