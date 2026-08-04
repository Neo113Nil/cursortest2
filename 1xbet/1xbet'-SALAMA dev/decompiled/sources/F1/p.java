package F1;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f2560c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2561a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2562b = -1;

    public final boolean a(String str) {
        Matcher matcher = f2560c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i7 = p151v2.t.f17159a;
            int i8 = Integer.parseInt(strGroup, 16);
            int i9 = Integer.parseInt(matcher.group(2), 16);
            if (i8 <= 0 && i9 <= 0) {
                return false;
            }
            this.f2561a = i8;
            this.f2562b = i9;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(Metadata metadata) {
        int i7 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f10562a;
            if (i7 >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i7];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f10619c) && a(commentFrame.f10620d)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f10626b) && "iTunSMPB".equals(internalFrame.f10627c) && a(internalFrame.f10628d)) {
                    return;
                }
            } else {
                continue;
            }
            i7++;
        }
    }
}
