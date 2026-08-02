package com.google.common.base;

/* loaded from: classes4.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final com.google.common.base.Splitter.Strategy strategy;
    private final com.google.common.base.CharMatcher trimmer;

    interface Strategy {
        java.util.Iterator<java.lang.String> iterator(com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence);
    }

    private Splitter(com.google.common.base.Splitter.Strategy strategy) {
        this(strategy, false, com.google.common.base.CharMatcher.none(), Integer.MAX_VALUE);
    }

    private Splitter(com.google.common.base.Splitter.Strategy strategy, boolean z, com.google.common.base.CharMatcher charMatcher, int i) {
        this.strategy = strategy;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    public static com.google.common.base.Splitter on(char c) {
        return on(com.google.common.base.CharMatcher.is(c));
    }

    public static com.google.common.base.Splitter on(final com.google.common.base.CharMatcher charMatcher) {
        com.google.common.base.Preconditions.checkNotNull(charMatcher);
        return new com.google.common.base.Splitter(new com.google.common.base.Splitter.Strategy() { // from class: com.google.common.base.Splitter$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Splitter.Strategy
            public final java.util.Iterator iterator(com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
                return com.google.common.base.Splitter.lambda$on$0(com.google.common.base.CharMatcher.this, splitter, charSequence);
            }
        });
    }

    static /* synthetic */ java.util.Iterator lambda$on$0(final com.google.common.base.CharMatcher charMatcher, com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
        return new com.google.common.base.Splitter.SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.SplittingIterator
            int separatorEnd(int i) {
                return i + 1;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            int separatorStart(int i) {
                return charMatcher.indexIn(this.toSplit, i);
            }
        };
    }

    public static com.google.common.base.Splitter on(final java.lang.String str) {
        com.google.common.base.Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new com.google.common.base.Splitter(new com.google.common.base.Splitter.Strategy() { // from class: com.google.common.base.Splitter$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Splitter.Strategy
            public final java.util.Iterator iterator(com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
                return com.google.common.base.Splitter.lambda$on$1(str, splitter, charSequence);
            }
        });
    }

    static /* synthetic */ java.util.Iterator lambda$on$1(final java.lang.String str, com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
        return new com.google.common.base.Splitter.SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.2
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
            
                r6 = r6 + 1;
             */
            @Override // com.google.common.base.Splitter.SplittingIterator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int separatorStart(int i) {
                int length = str.length();
                int length2 = this.toSplit.length();
                while (i <= length2 - length) {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (this.toSplit.charAt(i2 + i) != str.charAt(i2)) {
                            break;
                        }
                    }
                    return i;
                }
                return -1;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i) {
                return i + str.length();
            }
        };
    }

    public static com.google.common.base.Splitter on(java.util.regex.Pattern pattern) {
        return onPatternInternal(new com.google.common.base.JdkPattern(pattern));
    }

    static com.google.common.base.Splitter onPatternInternal(final com.google.common.base.CommonPattern commonPattern) {
        com.google.common.base.Preconditions.checkArgument(!commonPattern.matcher("").matches(), "The pattern may not match the empty string: %s", commonPattern);
        return new com.google.common.base.Splitter(new com.google.common.base.Splitter.Strategy() { // from class: com.google.common.base.Splitter$$ExternalSyntheticLambda3
            @Override // com.google.common.base.Splitter.Strategy
            public final java.util.Iterator iterator(com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
                return com.google.common.base.Splitter.lambda$onPatternInternal$0(com.google.common.base.CommonPattern.this, splitter, charSequence);
            }
        });
    }

    static /* synthetic */ java.util.Iterator lambda$onPatternInternal$0(com.google.common.base.CommonPattern commonPattern, com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
        final com.google.common.base.CommonMatcher matcher = commonPattern.matcher(charSequence);
        return new com.google.common.base.Splitter.SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.3
            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i) {
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i) {
                return matcher.end();
            }
        };
    }

    public static com.google.common.base.Splitter onPattern(java.lang.String str) {
        return onPatternInternal(com.google.common.base.Platform.compilePattern(str));
    }

    public static com.google.common.base.Splitter fixedLength(final int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "The length may not be less than 1");
        return new com.google.common.base.Splitter(new com.google.common.base.Splitter.Strategy() { // from class: com.google.common.base.Splitter$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Splitter.Strategy
            public final java.util.Iterator iterator(com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
                return com.google.common.base.Splitter.lambda$fixedLength$0(i, splitter, charSequence);
            }
        });
    }

    static /* synthetic */ java.util.Iterator lambda$fixedLength$0(final int i, com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
        return new com.google.common.base.Splitter.SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.4
            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i2) {
                return i2;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i2) {
                int i3 = i2 + i;
                if (i3 < this.toSplit.length()) {
                    return i3;
                }
                return -1;
            }
        };
    }

    public final com.google.common.base.Splitter omitEmptyStrings() {
        return new com.google.common.base.Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public final com.google.common.base.Splitter limit(int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "must be greater than zero: %s", i);
        return new com.google.common.base.Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public final com.google.common.base.Splitter trimResults() {
        return trimResults(com.google.common.base.CharMatcher.whitespace());
    }

    public final com.google.common.base.Splitter trimResults(com.google.common.base.CharMatcher charMatcher) {
        com.google.common.base.Preconditions.checkNotNull(charMatcher);
        return new com.google.common.base.Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    public final java.lang.Iterable<java.lang.String> split(final java.lang.CharSequence charSequence) {
        com.google.common.base.Preconditions.checkNotNull(charSequence);
        return new java.lang.Iterable<java.lang.String>(this) { // from class: com.google.common.base.Splitter.5
            final /* synthetic */ com.google.common.base.Splitter this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<java.lang.String> iterator() {
                return this.this$0.splittingIterator(charSequence);
            }

            public java.lang.String toString() {
                com.google.common.base.Joiner on = com.google.common.base.Joiner.on(", ");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                java.lang.StringBuilder appendTo = on.appendTo(sb, (java.lang.Iterable<?>) this);
                appendTo.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return appendTo.toString();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Iterator<java.lang.String> splittingIterator(java.lang.CharSequence charSequence) {
        return this.strategy.iterator(this, charSequence);
    }

    public final java.util.List<java.lang.String> splitToList(java.lang.CharSequence charSequence) {
        com.google.common.base.Preconditions.checkNotNull(charSequence);
        java.util.Iterator<java.lang.String> splittingIterator = splittingIterator(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (splittingIterator.hasNext()) {
            arrayList.add(splittingIterator.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public final java.util.stream.Stream<java.lang.String> splitToStream(java.lang.CharSequence charSequence) {
        return java.util.stream.StreamSupport.stream(split(charSequence).spliterator(), false);
    }

    public final com.google.common.base.Splitter.MapSplitter withKeyValueSeparator(java.lang.String str) {
        return withKeyValueSeparator(on(str));
    }

    public final com.google.common.base.Splitter.MapSplitter withKeyValueSeparator(char c) {
        return withKeyValueSeparator(on(c));
    }

    public final com.google.common.base.Splitter.MapSplitter withKeyValueSeparator(com.google.common.base.Splitter splitter) {
        return new com.google.common.base.Splitter.MapSplitter(splitter);
    }

    /* loaded from: classes9.dex */
    public static final class MapSplitter {
        private static final java.lang.String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final com.google.common.base.Splitter entrySplitter;
        private final com.google.common.base.Splitter outerSplitter;

        private MapSplitter(com.google.common.base.Splitter splitter, com.google.common.base.Splitter splitter2) {
            this.outerSplitter = splitter;
            this.entrySplitter = (com.google.common.base.Splitter) com.google.common.base.Preconditions.checkNotNull(splitter2);
        }

        public final java.util.Map<java.lang.String, java.lang.String> split(java.lang.CharSequence charSequence) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.String str : this.outerSplitter.split(charSequence)) {
                java.util.Iterator splittingIterator = this.entrySplitter.splittingIterator(str);
                com.google.common.base.Preconditions.checkArgument(splittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                java.lang.String str2 = (java.lang.String) splittingIterator.next();
                com.google.common.base.Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                com.google.common.base.Preconditions.checkArgument(splittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                linkedHashMap.put(str2, (java.lang.String) splittingIterator.next());
                com.google.common.base.Preconditions.checkArgument(!splittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
            }
            return java.util.Collections.unmodifiableMap(linkedHashMap);
        }
    }

    static abstract class SplittingIterator extends com.google.common.base.AbstractIterator<java.lang.String> {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final java.lang.CharSequence toSplit;
        final com.google.common.base.CharMatcher trimmer;

        abstract int separatorEnd(int i);

        abstract int separatorStart(int i);

        SplittingIterator(com.google.common.base.Splitter splitter, java.lang.CharSequence charSequence) {
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractIterator
        public java.lang.String computeNext() {
            int separatorStart;
            int i = this.offset;
            while (true) {
                int i2 = this.offset;
                if (i2 != -1) {
                    separatorStart = separatorStart(i2);
                    if (separatorStart == -1) {
                        separatorStart = this.toSplit.length();
                        this.offset = -1;
                    } else {
                        this.offset = separatorEnd(separatorStart);
                    }
                    int i3 = this.offset;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.offset = i4;
                        if (i4 > this.toSplit.length()) {
                            this.offset = -1;
                        }
                    } else {
                        while (i < separatorStart && this.trimmer.matches(this.toSplit.charAt(i))) {
                            i++;
                        }
                        while (separatorStart > i && this.trimmer.matches(this.toSplit.charAt(separatorStart - 1))) {
                            separatorStart--;
                        }
                        if (!this.omitEmptyStrings || i != separatorStart) {
                            break;
                        }
                        i = this.offset;
                    }
                } else {
                    return endOfData();
                }
            }
            int i5 = this.limit;
            if (i5 == 1) {
                separatorStart = this.toSplit.length();
                this.offset = -1;
                while (separatorStart > i && this.trimmer.matches(this.toSplit.charAt(separatorStart - 1))) {
                    separatorStart--;
                }
            } else {
                this.limit = i5 - 1;
            }
            return this.toSplit.subSequence(i, separatorStart).toString();
        }
    }
}
