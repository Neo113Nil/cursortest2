package kotlinx.io.files;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/io/files/NioMover;", "Lkotlinx/io/files/Mover;", "<init>", "()V", "Lkotlinx/io/files/Path;", "p0", "p1", "", "move", "(Lkotlinx/io/files/Path;Lkotlinx/io/files/Path;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class NioMover implements kotlinx.io.files.Mover {
    @Override // kotlinx.io.files.Mover
    @kotlinx.io.files.AnimalSnifferIgnore
    public final void move(kotlinx.io.files.Path p0, kotlinx.io.files.Path p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (!p0.getFile().exists()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Source file does not exist: ");
            sb.append(p0.getFile());
            throw new java.io.FileNotFoundException(sb.toString());
        }
        try {
            java.nio.file.Files.move(p0.getFile().toPath(), p1.getFile().toPath(), java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (java.lang.Throwable th) {
            if (!(th instanceof java.io.IOException)) {
                throw new java.io.IOException("Move failed", th);
            }
            throw th;
        }
    }
}
