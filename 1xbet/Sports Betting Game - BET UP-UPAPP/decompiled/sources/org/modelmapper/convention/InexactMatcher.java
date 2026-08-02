package org.modelmapper.convention;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.spi.PropertyNameInfo;
import org.modelmapper.spi.Tokens;

/* loaded from: classes4.dex */
class InexactMatcher {
    protected final List<Tokens> destTokens;
    protected final PropertyNameInfo propertyNameInfo;
    protected final List<Tokens> sourceTokens;

    InexactMatcher(PropertyNameInfo propertyNameInfo) {
        this.propertyNameInfo = propertyNameInfo;
        this.sourceTokens = propertyNameInfo.getSourcePropertyTokens();
        this.destTokens = propertyNameInfo.getDestinationPropertyTokens();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int matchTokens(Tokens tokens, Tokens tokens2, int i) {
        int i2 = 0;
        while (i2 < tokens.size()) {
            TokensIterator of = TokensIterator.of(tokens, i2);
            TokensIterator of2 = TokensIterator.of(tokens2, i);
            StringIterator of3 = StringIterator.of(of.next());
            StringIterator of4 = StringIterator.of(of2.next());
            while (true) {
                if ((of3.hasNext() || of3.hasNext()) && matchToken(of3, of4)) {
                    if (!of3.hasNext() && !of4.hasNext()) {
                        return (of2.pos() - i) + 1;
                    }
                    if ((of3.hasNext() || of.hasNext()) && (of4.hasNext() || of2.hasNext())) {
                        if (!of3.hasNext() && of.hasNext()) {
                            of3 = StringIterator.of(of.next());
                        }
                        if (!of4.hasNext() && of2.hasNext()) {
                            of4 = StringIterator.of(of2.next());
                        }
                    }
                }
            }
        }
        return 0;
    }

    static boolean matchToken(StringIterator stringIterator, StringIterator stringIterator2) {
        while (stringIterator.hasNext() && stringIterator2.hasNext()) {
            char charValue = stringIterator.next().charValue();
            char charValue2 = stringIterator2.next().charValue();
            if (Character.toUpperCase(charValue) != Character.toUpperCase(charValue2) || Character.toLowerCase(charValue) != Character.toLowerCase(charValue2)) {
                return false;
            }
        }
        return true;
    }

    boolean matchSourceClass(String str) {
        Iterator<String> it = this.propertyNameInfo.getSourceClassTokens().iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    boolean matchSourcePropertyType(String str) {
        Iterator<Tokens> it = this.propertyNameInfo.getSourcePropertyTypeTokens().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    DestTokensMatcher matchSourcePropertyName(Tokens tokens, int i) {
        int[] iArr = new int[this.sourceTokens.size()];
        for (int i2 = 0; i2 < this.sourceTokens.size(); i2++) {
            iArr[i2] = matchTokens(this.sourceTokens.get(i2), tokens, i);
        }
        return new DestTokensMatcher(iArr);
    }

    static class TokensIterator {
        private int pos;
        private Tokens tokens;

        static TokensIterator of(Tokens tokens, int i) {
            return new TokensIterator(tokens, i - 1);
        }

        TokensIterator(Tokens tokens, int i) {
            this.tokens = tokens;
            this.pos = i;
        }

        public boolean hasNext() {
            return this.pos < this.tokens.size() - 1;
        }

        public String next() {
            Tokens tokens = this.tokens;
            int i = this.pos + 1;
            this.pos = i;
            return tokens.token(i);
        }

        public int pos() {
            return this.pos;
        }
    }

    static class StringIterator {
        private int pos = -1;
        private String text;

        static StringIterator of(String str) {
            return new StringIterator(str);
        }

        StringIterator(String str) {
            this.text = str;
        }

        public boolean hasNext() {
            return this.pos < this.text.length() - 1;
        }

        public Character next() {
            String str = this.text;
            int i = this.pos + 1;
            this.pos = i;
            return Character.valueOf(str.charAt(i));
        }
    }

    static class DestTokensMatcher {
        int[] counts;

        DestTokensMatcher(int[] iArr) {
            this.counts = iArr;
        }

        boolean match() {
            for (int i : this.counts) {
                if (i > 0) {
                    return true;
                }
            }
            return false;
        }

        boolean match(int i) {
            return this.counts[i] > 0;
        }

        int maxMatchTokens() {
            int i = 0;
            int i2 = 1;
            while (true) {
                int[] iArr = this.counts;
                if (i2 < iArr.length) {
                    if (iArr[i2] > iArr[i]) {
                        i = i2;
                    }
                    i2++;
                } else {
                    return iArr[i];
                }
            }
        }

        Collection<Integer> matchSources() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int[] iArr = this.counts;
                if (i >= iArr.length) {
                    return arrayList;
                }
                if (iArr[i] > 0) {
                    arrayList.add(Integer.valueOf(i));
                }
                i++;
            }
        }
    }
}
