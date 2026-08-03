package androidx.emoji2.text;

/* loaded from: classes2.dex */
class EmojiExclusions {
    private EmojiExclusions() {
    }

    static java.util.Set<int[]> getEmojiExclusions() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.emoji2.text.EmojiExclusions.EmojiExclusions_Api34.getExclusions();
        }
        return androidx.emoji2.text.EmojiExclusions.EmojiExclusions_Reflections.getExclusions();
    }

    private static class EmojiExclusions_Api34 {
        private EmojiExclusions_Api34() {
        }

        static java.util.Set<int[]> getExclusions() {
            return androidx.emoji2.text.EmojiExclusions.EmojiExclusions_Reflections.getExclusions();
        }
    }

    private static class EmojiExclusions_Reflections {
        private EmojiExclusions_Reflections() {
        }

        static java.util.Set<int[]> getExclusions() {
            try {
                java.lang.Object invoke = java.lang.Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                if (invoke == null) {
                    return java.util.Collections.emptySet();
                }
                java.util.Set<int[]> set = (java.util.Set) invoke;
                java.util.Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return java.util.Collections.emptySet();
                    }
                }
                return set;
            } catch (java.lang.Throwable unused) {
                return java.util.Collections.emptySet();
            }
        }
    }
}
