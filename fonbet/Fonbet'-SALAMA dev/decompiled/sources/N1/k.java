package N1;

import C1.C0095a;
import android.util.Log;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f4704a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i7, C0095a c0095a) {
        int g3 = c0095a.g();
        if (c0095a.g() == 1684108385) {
            c0095a.E(8);
            String p5 = c0095a.p(g3 - 16);
            return new CommentFrame("und", p5, p5);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + D1.a.c(i7));
        return null;
    }

    public static ApicFrame b(C0095a c0095a) {
        int g3 = c0095a.g();
        if (c0095a.g() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int g7 = c0095a.g() & 16777215;
        String str = g7 == 13 ? "image/jpeg" : g7 == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC1663a.j(g7, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        c0095a.E(4);
        int i7 = g3 - 16;
        byte[] bArr = new byte[i7];
        c0095a.f(bArr, 0, i7);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static TextInformationFrame c(int i7, C0095a c0095a, String str) {
        int g3 = c0095a.g();
        if (c0095a.g() == 1684108385 && g3 >= 22) {
            c0095a.E(10);
            int y4 = c0095a.y();
            if (y4 > 0) {
                String d7 = e1.k.d(y4, "");
                int y5 = c0095a.y();
                if (y5 > 0) {
                    d7 = d7 + "/" + y5;
                }
                return new TextInformationFrame(str, null, d7);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + D1.a.c(i7));
        return null;
    }

    public static TextInformationFrame d(int i7, C0095a c0095a, String str) {
        int g3 = c0095a.g();
        if (c0095a.g() == 1684108385) {
            c0095a.E(8);
            return new TextInformationFrame(str, null, c0095a.p(g3 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + D1.a.c(i7));
        return null;
    }

    public static Id3Frame e(int i7, String str, C0095a c0095a, boolean z4, boolean z7) {
        int f7 = f(c0095a);
        if (z7) {
            f7 = Math.min(1, f7);
        }
        if (f7 >= 0) {
            return z4 ? new TextInformationFrame(str, null, Integer.toString(f7)) : new CommentFrame("und", str, Integer.toString(f7));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + D1.a.c(i7));
        return null;
    }

    public static int f(C0095a c0095a) {
        c0095a.E(4);
        if (c0095a.g() == 1684108385) {
            c0095a.E(8);
            return c0095a.t();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
