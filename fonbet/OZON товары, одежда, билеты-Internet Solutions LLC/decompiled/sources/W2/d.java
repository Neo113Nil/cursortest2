package W2;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class d extends AbstractC7737t implements Function0<File> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f33208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    d(Function0<? extends File> function0) {
        super(0);
        this.f33208b = (AbstractC7737t) function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        File file = (File) this.f33208b.invoke();
        if (Intrinsics.d(bd.h.i(file), "preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
            return absoluteFile;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
