package org.modelmapper.spi;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class Tokens implements Iterable<String> {
    private String[] tokens;

    public static Tokens of(String... strArr) {
        return new Tokens(strArr);
    }

    private Tokens(String[] strArr) {
        this.tokens = strArr;
    }

    public String token(int i) {
        return this.tokens[i];
    }

    public int size() {
        return this.tokens.length;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return Arrays.asList(this.tokens).iterator();
    }

    public String toString() {
        return Arrays.toString(this.tokens);
    }
}
