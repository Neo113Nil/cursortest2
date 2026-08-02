package androidx.media3.extractor.metadata.flac;

import androidx.annotation.Nullable;
import androidx.compose.runtime.collection.a;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.c;

@UnstableApi
@Deprecated
/* loaded from: classes3.dex */
public class VorbisComment implements Metadata.Entry {
    public final String key;
    public final String value;

    public VorbisComment(String str, String str2) {
        this.key = c.c(str);
        this.value = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode() + a.a(527, 31, this.key);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.key;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer h = com.google.common.primitives.c.h(this.value);
                if (h != null) {
                    builder.setTotalTrackCount(h);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer h2 = com.google.common.primitives.c.h(this.value);
                if (h2 != null) {
                    builder.setTotalDiscCount(h2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer h3 = com.google.common.primitives.c.h(this.value);
                if (h3 != null) {
                    builder.setTrackNumber(h3);
                    break;
                }
                break;
            case "ALBUM":
                builder.setAlbumTitle(this.value);
                break;
            case "GENRE":
                builder.setGenre(this.value);
                break;
            case "TITLE":
                builder.setTitle(this.value);
                break;
            case "DESCRIPTION":
                builder.setDescription(this.value);
                break;
            case "DISCNUMBER":
                Integer h4 = com.google.common.primitives.c.h(this.value);
                if (h4 != null) {
                    builder.setDiscNumber(h4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                builder.setAlbumArtist(this.value);
                break;
            case "ARTIST":
                builder.setArtist(this.value);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.key + "=" + this.value;
    }
}
