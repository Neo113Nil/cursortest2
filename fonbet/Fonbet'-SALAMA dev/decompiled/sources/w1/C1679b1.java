package w1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: w1.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1679b1 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f17649b;

    public /* synthetic */ C1679b1(int i7, Serializable serializable) {
        this.f17648a = i7;
        this.f17649b = serializable;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f17648a) {
            case 0:
                return ((Pattern) this.f17649b).matcher(str).matches();
            case 1:
                return ((Pattern) this.f17649b).matcher(str).matches();
            default:
                return str.startsWith((String) this.f17649b);
        }
    }
}
