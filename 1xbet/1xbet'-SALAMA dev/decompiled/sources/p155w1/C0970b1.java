package p155w1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: w1.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0970b1 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f17655b;

    public /* synthetic */ C0970b1(int i7, Serializable serializable) {
        this.f17654a = i7;
        this.f17655b = serializable;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f17654a) {
            case 0:
                return ((Pattern) this.f17655b).matcher(str).matches();
            case 1:
                return ((Pattern) this.f17655b).matcher(str).matches();
            default:
                return str.startsWith((String) this.f17655b);
        }
    }
}
