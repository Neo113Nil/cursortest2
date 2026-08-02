package N30;

import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BANK;

    @NotNull
    public static final C0357a Companion;
    public static final a QR;

    /* renamed from: N30.a$a, reason: collision with other inner class name */
    public static final class C0357a {
    }

    static {
        a aVar = new a("BANK", 0);
        BANK = aVar;
        a aVar2 = new a(TakePhotoRequest.QR_SCANNER_TYPE, 1);
        QR = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
        Companion = new C0357a();
    }

    private a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
