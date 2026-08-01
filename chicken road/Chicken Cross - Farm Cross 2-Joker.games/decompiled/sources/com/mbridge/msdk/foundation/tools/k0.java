package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: SameBase64Tool.java */
/* loaded from: classes6.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f9431a;
    private static Map<Character, Character> b;
    private static byte[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
    private static char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', GMTDateParser.MONTH, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', GMTDateParser.YEAR, 'Z', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f', 'g', GMTDateParser.HOURS, 'i', 'j', 'k', 'l', GMTDateParser.MINUTES, 'n', 'o', 'p', 'q', 'r', GMTDateParser.SECONDS, 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', GMTDateParser.ZONE, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', FileSystemKt.UnixPathSeparator};

    static {
        HashMap hashMap = new HashMap();
        f9431a = hashMap;
        hashMap.put('v', 'A');
        f9431a.put('S', 'B');
        f9431a.put('o', 'C');
        f9431a.put('a', 'D');
        f9431a.put('j', 'E');
        f9431a.put('c', 'F');
        f9431a.put('7', 'G');
        f9431a.put(Character.valueOf(GMTDateParser.DAY_OF_MONTH), 'H');
        f9431a.put('R', 'I');
        f9431a.put(Character.valueOf(GMTDateParser.ZONE), 'J');
        f9431a.put('p', 'K');
        f9431a.put('W', 'L');
        f9431a.put('i', Character.valueOf(GMTDateParser.MONTH));
        f9431a.put('f', 'N');
        f9431a.put('G', 'O');
        f9431a.put('y', 'P');
        f9431a.put('N', 'Q');
        f9431a.put('x', 'R');
        f9431a.put('Z', 'S');
        f9431a.put('n', 'T');
        f9431a.put('V', 'U');
        f9431a.put('5', 'V');
        f9431a.put('k', 'W');
        f9431a.put('+', 'X');
        f9431a.put('D', Character.valueOf(GMTDateParser.YEAR));
        f9431a.put('H', 'Z');
        f9431a.put('L', 'a');
        f9431a.put(Character.valueOf(GMTDateParser.YEAR), 'b');
        f9431a.put(Character.valueOf(GMTDateParser.HOURS), 'c');
        f9431a.put('J', Character.valueOf(GMTDateParser.DAY_OF_MONTH));
        f9431a.put('4', 'e');
        f9431a.put('6', 'f');
        f9431a.put('l', 'g');
        f9431a.put('t', Character.valueOf(GMTDateParser.HOURS));
        f9431a.put('0', 'i');
        f9431a.put('U', 'j');
        f9431a.put('3', 'k');
        f9431a.put('Q', 'l');
        f9431a.put('r', Character.valueOf(GMTDateParser.MINUTES));
        f9431a.put('g', 'n');
        f9431a.put('E', 'o');
        f9431a.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'p');
        f9431a.put('q', 'q');
        f9431a.put('8', 'r');
        f9431a.put(Character.valueOf(GMTDateParser.SECONDS), Character.valueOf(GMTDateParser.SECONDS));
        f9431a.put('w', 't');
        f9431a.put(Character.valueOf(FileSystemKt.UnixPathSeparator), Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f9431a.put('X', 'v');
        f9431a.put(Character.valueOf(GMTDateParser.MONTH), 'w');
        f9431a.put('e', 'x');
        f9431a.put('B', 'y');
        f9431a.put('A', Character.valueOf(GMTDateParser.ZONE));
        f9431a.put('T', '0');
        f9431a.put('2', '1');
        f9431a.put('F', '2');
        f9431a.put('b', '3');
        f9431a.put('9', '4');
        f9431a.put('P', '5');
        f9431a.put('1', '6');
        f9431a.put('O', '7');
        f9431a.put('I', '8');
        f9431a.put('K', '9');
        f9431a.put(Character.valueOf(GMTDateParser.MINUTES), '+');
        f9431a.put('C', Character.valueOf(FileSystemKt.UnixPathSeparator));
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap2.put('A', 'v');
        b.put('B', 'S');
        b.put('C', 'o');
        b.put('D', 'a');
        b.put('E', 'j');
        b.put('F', 'c');
        b.put('G', '7');
        b.put('H', Character.valueOf(GMTDateParser.DAY_OF_MONTH));
        b.put('I', 'R');
        b.put('J', Character.valueOf(GMTDateParser.ZONE));
        b.put('K', 'p');
        b.put('L', 'W');
        b.put(Character.valueOf(GMTDateParser.MONTH), 'i');
        b.put('N', 'f');
        b.put('O', 'G');
        b.put('P', 'y');
        b.put('Q', 'N');
        b.put('R', 'x');
        b.put('S', 'Z');
        b.put('T', 'n');
        b.put('U', 'V');
        b.put('V', '5');
        b.put('W', 'k');
        b.put('X', '+');
        b.put(Character.valueOf(GMTDateParser.YEAR), 'D');
        b.put('Z', 'H');
        b.put('a', 'L');
        b.put('b', Character.valueOf(GMTDateParser.YEAR));
        b.put('c', Character.valueOf(GMTDateParser.HOURS));
        b.put(Character.valueOf(GMTDateParser.DAY_OF_MONTH), 'J');
        b.put('e', '4');
        b.put('f', '6');
        b.put('g', 'l');
        b.put(Character.valueOf(GMTDateParser.HOURS), 't');
        b.put('i', '0');
        b.put('j', 'U');
        b.put('k', '3');
        b.put('l', 'Q');
        b.put(Character.valueOf(GMTDateParser.MINUTES), 'r');
        b.put('n', 'g');
        b.put('o', 'E');
        b.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        b.put('q', 'q');
        b.put('r', '8');
        b.put(Character.valueOf(GMTDateParser.SECONDS), Character.valueOf(GMTDateParser.SECONDS));
        b.put('t', 'w');
        b.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), Character.valueOf(FileSystemKt.UnixPathSeparator));
        b.put('v', 'X');
        b.put('w', Character.valueOf(GMTDateParser.MONTH));
        b.put('x', 'e');
        b.put('y', 'B');
        b.put(Character.valueOf(GMTDateParser.ZONE), 'A');
        b.put('0', 'T');
        b.put('1', '2');
        b.put('2', 'F');
        b.put('3', 'b');
        b.put('4', '9');
        b.put('5', 'P');
        b.put('6', '1');
        b.put('7', 'O');
        b.put('8', 'I');
        b.put('9', 'K');
        b.put('+', Character.valueOf(GMTDateParser.MINUTES));
        b.put(Character.valueOf(FileSystemKt.UnixPathSeparator), 'C');
    }

    public static String a(String str) {
        return r0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : r0.c(str);
    }
}
