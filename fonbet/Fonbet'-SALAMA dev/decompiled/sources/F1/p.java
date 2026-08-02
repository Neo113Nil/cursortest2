package F1;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2560c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f2561a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2562b = -1;

    public final boolean a(String str) {
        Matcher matcher = f2560c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i7 = v2.t.f17153a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f2561a = parseInt;
            this.f2562b = parseInt2;
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
