package kotlinx.io.files;

/* compiled from: FileSystemJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017¨\u0006\t"}, d2 = {"Lkotlinx/io/files/NioMover;", "Lkotlinx/io/files/Mover;", "<init>", "()V", "move", "", "source", "Lkotlinx/io/files/Path;", "destination", "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NioMover implements kotlinx.io.files.Mover {
    @Override // kotlinx.io.files.Mover
    @kotlinx.io.files.AnimalSnifferIgnore
    public void move(kotlinx.io.files.Path source, kotlinx.io.files.Path destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        if (!source.getFile().exists()) {
            throw new java.io.FileNotFoundException("Source file does not exist: " + source.getFile());
        }
        try {
            java.nio.file.Files.move(source.getFile().toPath(), destination.getFile().toPath(), java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (java.lang.Throwable th) {
            if (!(th instanceof java.io.IOException)) {
                throw new java.io.IOException("Move failed", th);
            }
            throw th;
        }
    }
}
